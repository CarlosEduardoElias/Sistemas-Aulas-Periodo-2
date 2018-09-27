<?php 
	if (!isset ($pagina)){
		header("location: index.php");
	}
?>
<section id="trabalho">
<h1>Portfólio</h1>
<div class="container">
	<?php
	include "arraytrab.php";
		foreach ($trabalho as $p) {
		$nome = $p["nome"];
		$imagem = $p["imagem"];
		$link = $p["link"];
		echo "<div class='coluna'><a href='$imagem' data-lightbox='foto' title='$nome'><img src='$imagem'></a>
		<a class='acontat' href='$link'><p>$nome</p></a></div>";
	}
?>
</div>	
</section>