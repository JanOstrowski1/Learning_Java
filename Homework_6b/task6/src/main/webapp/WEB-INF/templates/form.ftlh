<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab|Lato" rel="stylesheet" >
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
    <style>
        body {
            background-color: #303030;
            font-family: 'Lato', sans-serif;
            font-size: 30px;
            color: #ffffff;
        }
        #container {
            margin-top: 40px;
            width: 800px;
            margin-left: auto;
            margin-right: auto;
            height: 600px;
            position: relative;
            background-color:slateblue;
        }
    </style>
</head>
<body>
<div id="container">
    <form class="form-horizontal" role="form"  method="post">
        <br><h1 style="text-align: center">Ciąg Fibonacciego</h1><br><h2 style="text-align: center">Wygeneruj n początkowych wyrazów ciągu</h2><br>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label"> </label>
            <div class="col-sm-10">
                <input type="number" min="1" placeholder="Podaj wartość n " name="number" required >
            </div>
        </div>
        <br>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input class="btn btn-primary" type="submit" value="Oblicz">
            </div>
        </div>
    </form>
</div>

</body>
</html>