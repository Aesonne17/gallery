-- Create scheme for DB

-- Table for users
CREATE TABLE users (
    id number,
    nick varchar(100)
);

-- Table for albums
CREATE TABLE albums (
    id number,
    parentId number,
    description varchar(200)
);

-- Table for photos
CREATE TABLE photos (
    id number,
    albumId number,
    comment varchar(200)
);