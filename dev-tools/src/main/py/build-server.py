#!/usr/bin/python
import os
import shutil
import zipfile
import subprocess

print ("The project is launched...")

#set environment
print ("Setting environment data...")
PWD_DIRECTORY=os.path.abspath(__file__)
SOURCE_DIRECTORY=os.path.join(PWD_DIRECTORY[:-23], "resources")
MVN_SOURSE_DIRECTORY=PWD_DIRECTORY[:-37]
TOMCAT_NAME="gallery-tomcat"
TOMCAT_ARCHIVE_NAME=TOMCAT_NAME + ".zip"
TOMCAT_WAR_FOLDER="webapps"
TARGET_FOLDER="target"

#build project
print ("Building project...")
#TODO: deal with the problems of this parameter in different OS
subprocess.call(["mvn", "clean", "install"], cwd=MVN_SOURSE_DIRECTORY, shell=True)
#subprocess.call(["mvn", "clean", "install"], cwd=MVN_SOURSE_DIRECTORY)

#parse config
print ("Scanning configuration file...")
fileConfig = open(os.path.join(SOURCE_DIRECTORY, "build-server-config.txt"))
for line in fileConfig:
    if line.startswith("SERVER_DIRECTORY"):
        SERVER_DIRECTORY=line[17:]
fileConfig.close()
SERVER_FULL_PATH=os.path.join(SERVER_DIRECTORY, TOMCAT_NAME)
print ("The server will be installed in the directory: " + SERVER_DIRECTORY)

#build server
print ("Server building...")
if not os.path.exists(SERVER_DIRECTORY):
    os.makedirs(SERVER_DIRECTORY)
elif os.path.exists(SERVER_FULL_PATH):
    shutil.rmtree(SERVER_FULL_PATH)
shutil.copy(os.path.join(SOURCE_DIRECTORY, TOMCAT_ARCHIVE_NAME), os.path.join(SERVER_DIRECTORY, TOMCAT_ARCHIVE_NAME))
zipfile.ZipFile(os.path.join(SERVER_DIRECTORY, TOMCAT_ARCHIVE_NAME), 'r').extractall(SERVER_DIRECTORY)
os.remove(os.path.join(SERVER_DIRECTORY, TOMCAT_ARCHIVE_NAME))

#copying artifact
print ("Deploying app...")
shutil.copy(os.path.join(MVN_SOURSE_DIRECTORY, "rest-services", TARGET_FOLDER, "rest-services-1.0-SNAPSHOT.war"),
os.path.join(SERVER_FULL_PATH, TOMCAT_WAR_FOLDER, "rest-services.war"))

print ("The project was launched successfully")