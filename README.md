# klickagenda-teste
Teste Técnico do Klickagenda onde o desafio é criar um um cadastro de disponibilidade de horários que permita a profissionais prestadores de serviço inserir quais horários semanais eles podem receber agendamentos.

## REQUISITOS
- Cada profissional deve poder criar a sua configuração de disponibilidade de horários. Cada configuração de disponibilidade pertence a um profissional.

- Cada configuração de disponibilidade deve incluir as regras dos dias da semana em que o profissional que a utiliza trabalha. Isso permite uma personalização detalhada dos horários de trabalho para cada dia da semana.

- Para cada dia da semana, os profissionais devem poder selecionar vários intervalos de horários nos quais estão disponíveis para agendamentos. Isso permite uma flexibilidade total na definição dos horários de trabalho.

## Comandos rodados para o Postgres:

### Instalação
sudo apt-get install postgresql

sudo passwd postgres

### Ativando Serviço
sudo service postgresql start

sudo -u postgres psql

## Banco de Dados

### Dados do Banco de Dados

- localhost
- post: 5432
- username: postgres
- dbname: postgres
- password: 1234

### DDL 
CREATE TABLE usuario (id SERIAL PRIMARY KEY, nome VARCHAR(255) NOT NULL);

CREATE TABLE disponibilidade (chave_dia INTEGER NOT NULL, usuario_id INTEGER REFERENCES usuario(id), dia_semana VARCHAR(20) NOT NULL, PRIMARY KEY (chave_dia, usuario_id), CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id));

CREATE TABLE intervalo_disponibilidade (id SERIAL PRIMARY KEY, chave_dia_id INTEGER, usuario_id_ INTEGER, horario_inicio TIME NOT NULL, horario_fim TIME NOT NULL, CONSTRAINT fk_chave_dia_usuario FOREIGN KEY (chave_dia_id, usuario_id_) REFERENCES disponibilidade(chave_dia, usuario_id));

A Lógica do Banco Dados seria uma tabela para os usuários, uma para a disponibilidade (que tem duas chaves primárias a chave do dia e o id do usuário) e uma para os intervalos que se comunica através de uma chave estrangeira com a tabela da disponibilidade.

Chave relacionado aos dias:
1 -> Segunda
2 -> Terça
3 -> Quarta
4 -> Quinta
5 -> Sexta
6 -> Sábado
7 -> Domingo

## Requisitos
- O sistema está com erro, pois falta implementação de métodos de busca aos intervalos por usuário e falta a construção do Front para realizar as requisições

- O que está implementado é a listagem dos usuários e o acesso a outra página onde iria mostrar os seus horários de disponibilidade.

## Próximos Passos
- Resolver a busca do método de busca pelos horários e de salvar um novo horário;
- Implementar novos métodos no Spring para algumas buscas;
- Implementar os outros componentes do Front para realizar as operações CRUD;
- Estilizar o Front para facilidade de uso;