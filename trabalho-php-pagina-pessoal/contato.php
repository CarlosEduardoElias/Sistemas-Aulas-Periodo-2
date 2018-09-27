<?php 
	if (!isset ($pagina)){
		header("location: index.php");
	}
?>
<section id="contato">
<div class="container">
<div class="coluna alinhaesq">
		<h3>Informações para Contato</h3>
		<p>Email: carloseduardoeats@gmail.com</p>
            <p title="Contato" alt="Entre em Contato"> Telefone: (44) 99883-1537</p>
            <p><a  class="acontat " href="https://web.whatsapp.com/" title="Contato" 
            alt="Entre em Contato">Whatsapp: 9906-4166 </a></p>
            <p><a  class="acontat " href="https://www.linkedin.com/in/carlos-eduardo-santos-082794118/" title="Contato" 
            alt="Entre em Contato">Linkedin: Carlos Eduardo Santos</a></p>
            <p><a  class="acontat " href="https://www.facebook.com/carloseduardo.santos.56027281" title="Contato"
            alt="Entre em Contato">Facebook: Carlos Eduardo Elias </a></p>
            <p><a  class="acontat " href="https://secure.skype.com/portal/overview" title="Contato"
            alt="Entre em Contato">Skype: Carlos Eduardo</a></p>
</div>
<div class="coluna alinhaesq">
	<h3>Desenvolvimento</h3>
	<p>Tenha um site personalizado com a sua identidade visual, moderno, de acordo
		 com as tendências mais contemporâneas de desenvolvimento web.</p>
		 <p> Entre em contato ou deixe sua mensagem!</p>
</div>
<div class="coluna">
	<h3 class="alinhaesq">Deixe sua Mensagem</h3>
	<form class="" id="formulario" action="confirmacao.php" method="POST">
	 		<div class="texto">
	    		<label for="nome">Nome:</label>
	    		<input id="nome" name="nome" type="text" size="30" maxlenght="50" placeholder="Digite seu nome" required/>
	  		</div>
	  		<div class="texto">
	    		<label for="email">Email:</label>
	    		<input id="email" name="email" type="email" value="" size="30" placeholder="email@exemplo.com" required/>
	  		</div>
	  		<div class="texto">
	   			<label for="mensagem">Mensagem:</label>
	    		<textarea type="text" id="mensagem" name="mensagem" rows="4" cols="100" placeholder="Digite sua Mensagem..." required></textarea>
	  		</div><br>
	  		<div class="botoes">
				<input id="botaoum" type="reset" value="Limpar Campos" />	
				<input id="botaodois" type="submit" value="Enviar" />
			</div>
	</form>	
</div>
</div>
</section>