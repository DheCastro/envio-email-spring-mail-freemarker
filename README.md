# Envio de e-mail com Spring Mail e Freemarker
Projeto demonstrativo de envio de e-mails com Spring Mail, Freemarker e Gmail

Para testar o envio, basta usar um utilitário de requisições como o POSTMAN (https://www.postman.com/) e
disparar uma requisição do tipo POST para /enviandoEmail com a seguinte estrutura no body:

# Exemplo
{</br>
	"para": "emaildodestinatario@provedor.com", - Ex.: joaodoscodigos@gmail.com</br>
	"de":"emaildoremetente@provedor.com", - Ex.: zedainfra@gmail.com</br>
	"assunto": "Assunto do Email", - "Update sem Where hahaha"</br>
	"nome": "Nome do Remetente" - "Zé da Infra"</br>
}
