<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <style>

             body, html {
                 margin: 0;
                 padding: 0;
                 width: 100%;
             }

             nav {
                 background-color: #333;
                 width: 100%;
                 display: flex;
                 justify-content: space-evenly;
                 align-items: center;
                 box-sizing: border-box;
             }

             nav a {
                 color: white;
                 text-align: center;
                 padding: 14px 20px;
                 text-decoration: none;
                 font-size: 17px;
                 flex: 1;
             }

             nav a:hover {
                 background-color: #ddd;
                 color: black;
             }

             .content {
                 padding-top: 10px;
                 padding-left: 20px;
                 padding-right: 20px;
                 padding-bottom: 25px;
             }
         </style>
</head>
<body>

    <nav>
        <a href="/">Home</a>
        <a href="/users">Registration</a>
        <a href="/vehicles">Vehicles</a>
        <a href="/">Home</a>

    </nav>

</body>
</html>
