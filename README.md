# Envio de e-mail com Spring Mail e Freemarker
Projeto demonstrativo de envio de e-mails com Spring Mail, Freemarker e Gmail

Para testar o envio, basta usar um utilitário de requisições como o POSTMAN (https://www.postman.com/) e
disparar uma requisição do tipo POST para /enviandoEmail com a seguinte estrutura no body:

# Exemplo
{
	"para": "emaildodestinatario@provedor.com", - Ex.: joaodoscodigos@gmail.com
	"de":"emaildoremetente@provedor.com", - Ex.: zedainfra@gmail.com
	"assunto": "Assunto do Email", - "Update sem Where hahaha"
	"nome": "Nome do Remetente" - "Zé da Infra"
}
