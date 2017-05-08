# gallery
Application for storing photos, creating photo galleries, slide shows and collages

For build and deploy a project used:
- jdk (version 1.8.0_131);
- maven (version 3.5.0);
- python (version 3.5.2) - for building server only.

Build project:
- change settings in the config for building script: /dev-tools/src/resources/build-server-config.txt;
- run build-server.py.

For run project:
- start server:
Linux: in server_home_folder/gallery-tomcat/bin made all sh files executable; start server from that folder
with command "./catalina run";
Windows: in folder server_home_folder/gallery-tomcat/bin use dblclick on file startup.bat;
- in the address bar of any browser type: "http://localhost:8080/rest-services/login".