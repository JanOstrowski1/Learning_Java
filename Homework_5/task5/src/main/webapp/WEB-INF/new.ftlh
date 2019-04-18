<!DOCTYPE html>
<html>
<head>
    <title>Kind Servlet</title>
</head>
<body>
<h1> <strong>${name}</strong></h1>
<h1> <strong>${group}</strong></h1>
<h1> <strong>${.now?string.yyyy-MM-dd}</strong></h1>
<h1> <strong>${aDateTime?iso_nz("GMT+02")}</strong></h1>

</body>
</html>