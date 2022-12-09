<body bgcolor="pink">
    <h2>Fill below form to register</h2>
 
    <form method="post" action="/register">
        <table>
            <tr>
                <td>Enter your Id:</td>
                <td><input type="number" name="id" /></td>
            </tr>
            <tr>
                <td>Enter your name:</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>Enter your mail:</td>
                <td><input type="email" name="email" /></td>
            </tr>
            
            <tr>
                <td>Enter a password:</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Register"></td>
            </tr>
            <tr>
        </table>
    </form>
    <a href="/viewuser">View All User Details</a>
 
</body>
</html>
