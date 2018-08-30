const h1=document.querySelector('h1');
//instancia a primeira tag h1 para a constante h1

const pagina=document.querySelector('#pagina');
//instancia o id chamado pagina
// .nome = class, #nome = id, [nome] = atributo

const cidade=document.querySelector('#cidade')

const paragrafo=document.createElement('p');
//cria um novo elemento(tag) no documento atual

const cor=document.querySelector('#cor');

h1.innerHTML='Alfa';
//insere um texto ou tags para dentro do elemento instanciado e o sobrepõe

paragrafo.innerHTML='Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmodtempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.';

pagina.appendChild(paragrafo);
//adiciona como filho da pagina (div) o paragrafo

cidade.innerHTML='Douradina';

cor.classList.remove('#263238', 'blue-grey-text','darken-4');
//remove da lista de classes do elemento os contextos relacionados por virgula dentro da função remove