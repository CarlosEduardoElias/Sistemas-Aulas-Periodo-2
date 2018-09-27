<?php 
	if (!isset ($pagina)){
		header("location: index.php");
	}
?>
<section id="erro">
<h1 class="center"> Página não encontrada!</h1>
    <p class="center"><img src="imagens/error-404.png" title="Erro" alt="erro"></p>
        <h3 class="center">A página que você procura, não pôde ser encontrada.</h3>
            <h4 class="center">Possíveis Motivos:</h4>
                <h5 class="center">O Conteúdo não está mais no ar;</h5>
                <h5 class="center">A página mudou de lugar;</h5>
                <h5 class="center">Você digitou o endereço errado.</h5>
</section>