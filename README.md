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