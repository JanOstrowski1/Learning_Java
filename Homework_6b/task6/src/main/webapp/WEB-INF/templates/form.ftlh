<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
</head>
<style>
    .container {
        text-align: center;
        margin-top: 30px;
        margin-left: 80px;
        margin-right: 30px;
    }
</style>
<body>
<div class="container">
    <form class="form-horizontal" role="form" >
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label"><hi>Formularz</hi></label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" placeholder="Podaj liczbę">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Zaznacz mnie
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Oblicz !</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>