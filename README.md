# klickagenda-teste
Teste Técnico do Klickagenda onde o desafio é criar um um cadastro de disponibilidade de horários que permita a profissionais prestadores de serviço inserir quais horários semanais eles podem receber agendamentos.

## REQUISITOS
- Cada profissional deve poder criar a sua configuração de disponibilidade de horários. Cada configuração de disponibilidade pertence a um profissional.

- Cada configuração de disponibilidade deve incluir as regras dos dias da semana em que o profissional que a utiliza trabalha. Isso permite uma personalização detalhada dos horários de trabalho para cada dia da semana.

- Para cada dia da semana, os profissionais devem poder selecionar vários intervalos de horários nos quais estão disponíveis para agendamentos. Isso permite uma flexibilidade total na definição dos horários de trabalho.

## Sugestão de Abordagem:
- Modelagem de Banco de Dados: Crie uma estrutura de banco de dados que permita armazenar as configurações de disponibilidade dos profissionais, incluindo informações sobre os dias da semana e os intervalos de horários selecionados.

- Desenvolvimento de uma API REST: desenvolva uma API REST que permita cadastrar as configurações de disponibilidade dos profissionais e listar todas as disponibilidades cadastradas.

- Desenvolva uma interface web onde os profissionais possam facilmente cadastrar e visualizar suas configurações de disponibilidade de horários. Certifique-se de que a interface seja intuitiva e fácil de usar.

## Observações:
- Você tem liberdade para escolher a stack que desejar, no entanto, recomendamos dar prioridade ao desenvolvimento com Spring Boot, PostgreSQL, React e Tailwind CSS.

- Não é necessário implementar autenticação e autorização.

- Priorize a qualidade do código, seguindo boas práticas de desenvolvimento.

- Caso deseje, implemente funcionalidades adicionais para melhorar a experiência do usuário e a eficiência do sistema.

## Comandos rodados para o Postgres:

### Instalação
sudo apt-get install postgresql

sudo passwd postgres

### Ativando Serviço
sudo service postgresql start

sudo -u postgres psql

localhost
post: 5432
username: postgres
dbname: postgres
password: 1234


### DDL 
CREATE TABLE usuario (id SERIAL PRIMARY KEY, nome VARCHAR(255) NOT NULL);

CREATE TABLE disponibilidade (chave_dia INTEGER NOT NULL, usuario_id INTEGER REFERENCES usuario(id), dia_semana VARCHAR(20) NOT NULL, PRIMARY KEY (chave_dia, usuario_id), CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id));

CREATE TABLE intervalo_disponibilidade (id SERIAL PRIMARY KEY, chave_dia_id INTEGER, usuario_id_ INTEGER, horario_inicio TIME NOT NULL, horario_fim TIME NOT NULL, CONSTRAINT fk_chave_dia_usuario FOREIGN KEY (chave_dia_id, usuario_id_) REFERENCES disponibilidade(chave_dia, usuario_id));


### DML
INSERT INTO usuario (nome) VALUES ('Paulo');
INSERT INTO disponibilidade (chave_dia, usuario_id, dia_semana) VALUES (1, 1, 'Segunda-feira');
INSERT INTO intervalo_disponibilidade (chave_dia_id, usuario_id_ ,horario_inicio, horario_fim) VALUES (1, 1 ,'8:00', '12:00'), (1, 1,'14:00', '18:00');

** AJEITAR **
INSERT INTO disponibilidade (chave_dia, usuario_id, dia_semana) VALUES (2, 1, 'Terça-feira');
INSERT INTO intervalo_disponibilidade (chave_dia_id, horario_inicio, horario_fim) VALUES (2, '7:00', '10:00'), (2, '12:00', '16:00'), (2, '18:00', '20:00');

INSERT INTO disponibilidade (chave_dia, usuario_id, dia_semana) VALUES (3, 1, 'Quarta-feira');
INSERT INTO intervalo_disponibilidade (chave_dia_id, horario_inicio, horario_fim) VALUES (3, '9:00', '12:00'), (3, '14:00', '17:00');

INSERT INTO disponibilidade (chave_dia, usuario_id, dia_semana) VALUES (6, 1, 'Sábado');

INSERT INTO usuario (nome) VALUES ('Joana');
INSERT INTO disponibilidade (chave_dia, usuario_id, dia_semana) VALUES (1, 2, 'Segunda-feira');
INSERT INTO intervalo_disponibilidade (chave_dia_id, usuario_id_ ,horario_inicio, horario_fim) VALUES (1, 2 ,'9:00', '12:00'), (1, 2,'13:00', '18:00');


1 -> Segunda
2 -> Terça
3 -> Quarta
4 -> Quinta
5 -> Sexta
6 -> Sábado
7 -> Domingo