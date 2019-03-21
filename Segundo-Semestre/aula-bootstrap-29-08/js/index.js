const acesa=document.querySelector('#acesa');
const apagada=document.querySelector('#apagada');
const on=document.querySelector('#on');
const off=document.querySelector('#off');

	window.onload=()=>{
		acesa.style.display='none';
		off.disable=true;
	}

	on.addEventListener('click',()=>{
		acesa.style.display='block';
		apagada.style.display='none';

		off.disable=false;
		on.disable=true;
	})

	off.addEventListener('click',()=>{
		apagada.style.display='block';
		acesa.style.display='none';

		off.disable=true;
		on.disable=false;
	})
