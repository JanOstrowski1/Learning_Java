<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"">
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
            min-height: 400px;
            background-color:slateblue;
            position: relative;
        }
        .btn{
            background-color: red;
            color: greenyellow;
            position: absolute;
            bottom: 0;
        }
        table{
           border-color: white;
        }
    </style>
</head>
<body>
<div id="container"><br>
    &nbsp;&nbsp;&nbsp;&nbsp; Wyraz ciągu : n = ${number} dla którego wartość w ciągu fibonaciego wynosi ${value} !
    <br><br>
        <table border="10" >
            <tr>
                <th>&nbsp; Wyraz ciągu&nbsp; </th> <th>&nbsp; Wartość &nbsp;</th>
            </tr>
            <#list sequence as item>
            <tr>
                     <th>&nbsp;&nbsp;&nbsp;n = ${item?index+1} </th>
                    <th> &nbsp;&nbsp;${item} </th>
            </tr>
            </#list>
        </table><br><br>
       <button class="btn">
           <a href="http://localhost:8080/aplikacja"> Podrót do wyboru liczby </a>
       </button>
</div>

</body>
</html>