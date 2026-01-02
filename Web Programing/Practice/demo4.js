fs.read(fd, buffer,77, null, function(err, bytesRead) {
    console.log(buffer.toString("utf8", 0, bytesRead));
});
