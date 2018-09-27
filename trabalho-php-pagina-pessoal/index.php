<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadu</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="icones/008-code.png" />
    <link rel="stylesheet" type="text/css" href="css/lightbox.css" />
    <link rel="stylesheet" type="text/css" href="css/estilo.css" />
    <script src="js/jquery-2.2.4.min.js"></script>
    <script src="js/jquery.cycle2.min.js"></script>
    <script src="js/lightbox.min.js"></script>
</head>
<body>
<header>
    <a href="index.php" title="Home" class="logo">
        < Cadu/>
    </a>
    <nav>
        <ul>
            <li><a href="index.php?pagina=home">Home</a></li>
            <li><a href="index.php?pagina=sobre">Sobre</a></li>
            <li> <a href="index.php?pagina=trabalhos">Trabalhos</a></li>
            <li><a href="index.php?pagina=contato">Contato</a></li>
        </ul>
    </nav>
</header>
<main>
<?php 
    if (( isset ($_GET["pagina"])) and ($_GET["pagina"] != "index")){
        $pagina = trim($_GET["pagina"]);
    } else {
        $pagina = "home";
    }
    $pagina.=".php";
    if ( file_exists( $pagina)){
    include $pagina;
    } else {
        include "erro.php";
    }
?>
</main>
<footer>
    <div class="container">
        <div class="coluna alinhaesq">
            <h3><a class="aformat" href="index.php?pagina=contato">Entre em Contato</a></h3> 	
            <p><a  class="aformat" href="https://mail.google.com/mail/u/0/#inbox" title="Contato" 
            alt="Entre em Contato">Email: carloseduardoeats@gmail.com</a></p>
            <p title="Contato" alt="Entre em Contato"> Telefone: (44) 99883-1537</p>
            <p><a  class="aformat" href="https://web.whatsapp.com/" title="Contato" 
            alt="Entre em Contato">Whatsapp: 9906-4166 </a></p>
            <p><a  class="aformat" href="https://www.linkedin.com/in/carlos-eduardo-santos-082794118/" title="Contato" 
            alt="Entre em Contato">Linkedin: Carlos Eduardo Santos</a></p>
            <p><a  class="aformat" href="https://www.facebook.com/carloseduardo.santos.56027281" title="Contato"
            alt="Entre em Contato">Facebook: Carlos Eduardo Elias </a></p>
            <p><a  class="aformat" href="https://secure.skype.com/portal/overview" title="Contato"
            alt="Entre em Contato">Skype: Carlos Eduardo</a></p>
        </div>
        <div class="coluna">
            <h3>Relacionados</h3>
            <p><a  class="aformat" href="http://www.professorburnes.com.br/" title="Relacionados"
            alt="Páginas Relacionadas ao conteúdo"><strong> Professor Burnes</strong></a></p>
            <p><a  class="aformat" href="http://www.alfaumuarama.com.br/faculdade/" title="Relacionados"
            alt="Páginas Relacionadas ao conteúdo"> <strong>Faculdade Alfa</strong></a></p>
        </div>
        <div class="coluna">
            <h3><a class="aformat" href="index.php">&reg; Carlos Eduardo /></a></h3>
            <P>Desenvolvido por <strong>Carlos Eduardo</strong></p>
            <p><strong>&copy;</strong> 2018 - Todos os direitos reservados.</p>
        </div>
        <div class="coluna">
            <h3>Localização</h3>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14648.098141132365!2d-53.30493067932035!3d-23.387329656310836!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x948d222d01d93383%3A0x90ecfd6c278e877d!2sJardim+Barroso%2C+Douradina+-+PR%2C+87485-000!5e0!3m2!1spt-BR!2sbr!4v1537459301606" 
            width="300" height="200" frameborder="0" style="border:0" allowfullscreen></iframe>
        </div>
    </div>	
</footer>
</body>
</html>