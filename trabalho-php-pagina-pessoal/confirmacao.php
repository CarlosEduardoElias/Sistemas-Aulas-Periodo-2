<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadu/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="icones/003-laptop-1.png" />
    <link rel="stylesheet" type="text/css" href="css/estilo.css" />
</head>
        <?php   
            $nome 	= trim ($_POST["nome"]);
            $email 	= trim ($_POST["email"]);
            $mensagem  = trim ( $_POST["mensagem"]);
            if ( empty($nome)) { echo "<p class='center erromsg'>Erro: preencha o nome</p>"; exit;
            } 
            else if ( empty ($mensagem )) { echo "<p class='center erromsg'>Erro: preencha a mensagem</p>"; exit;
            } 
            else if ( !filter_var($email, FILTER_VALIDATE_EMAIL) ) { echo "<p class='center erromsg'>Preencha com um e-mail válido!</p>"; exit;
            }

            echo "<section id='confirma'><div class='center'><h3>Olá $nome, sua mensagem foi enviada com sucesso!</h3>
            <p>Obrigado por seu Contato.</p>
            <a href='index.php'><button id='botaodois'>Voltar</button></a></div></section>";
            ?>
