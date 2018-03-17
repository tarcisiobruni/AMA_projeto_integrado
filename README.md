#AMA - Projeto Integrado

<Grupo: Lucas Erlacher, Caio Kinupp, Tarcísio Bruni<br/>
Tema: Agenda Médica Automática

<h1>Minimundo:</h1>
</ hr>

<p align="justify">O AMA (Agenda Médica Automática) tem como objetivo otimizar a agenda médica com a redução e realocação de pacientes faltosos. Considerando que até 30% dos pacientes faltam em suas consultas agendadas (Fonte: https://www.gazetaonline.com.br/noticias/cidades/2017/07/mais-de-7-mil-pacientes-faltam-a-consultas-por-mes-em-vitoria-1014084392.html), o tempo de ociosidade do médico é muito grande, sendo muitas vezes inviável alocar outras pessoas para o horário livre e consequentemente, gerando um impacto no tempo de espera do paciente que poderia ser atendido em um prazo menor.</p>
<p>A aplicação permitirá o cadastro de horários para o atendimento pelos médicos e consulta dos horários disponíveis para os pacientes. Com essas informações, o sistema irá notificar os pacientes para identificar os faltosos e cruzar os dados de disponibilidade tanto dos médicos quanto dos pacientes para determinar o melhor dia e horário da consulta e otimizar a agenda.</p>
<p>Haverão três tipos de acesso ao sistema (paciente, médico e clínica/hospital), sendo que os pacientes possuirão os seguintes direitos: verificar todas consultas agendadas, verificar horário disponível dos médicos, agendar horário que desejar, cancelar consultas próprias. Aos médicos será possível: Registrar clínicas/hospitais que trabalham, registrar horários de atendimento, cadastrar a consulta de um paciente (inserir, alterar, consultar e excluir), definir o seu estado (atendendo ou não), consultar seus horários. Às clínicas/hospitais será possível registrar todos os médicos que trabalham no local puxando automaticamente o horário estabelecido pelo médico, consultar o estado atual de cada médico, cadastrar horários para o médico (inserir, alterar, consultar e excluir).</p>
<p>Para efetuar o cadastro de horário, o paciente poderá buscar o médico que deseja segundo alguns critérios como o nome do especialista, especialidade, cidade ou bairro. Após ter selecionado o médico em que se deseja agendar um horário o paciente selecionará a data que possui horários disponíveis (será indicado por cor, sendo as que estiverem verde com horário disponível) para o atendimento e que for melhor para ele.</p>
<p>Caso o paciente já possua um horário registrado, o sistema notificará via email o paciente para que confirme a data desejada (1 semana antes da consulta com prazo de até 3 dias para responder), caso não seja confirmado ele receberá uma notificação de que a consulta foi cancelada e haverá um tempo limite de 4 dias para realocar o horário.</p>
<p>O critério para realocação do horário será realizada de duas formas, se o usuário definir que deseja ser informado de forma maciça, todas as vezes que houver uma vaga livre ele será notificado (incluindo consultas que ocorrerão no mesmo dia), caso ele opte por ser informado ocasionalmente, apenas as consultas que estiverem pelo menos à uma semana da data corrente será exibida. A vaga será preenchida por quem aceitar o horário primeiro.</p>
<p>O alerta será disparado para um grupo de pessoas, e não todas as que possuem algum horário agendado. Quando o horário que ficar livre for preenchido, um novo horário será aberto e notificado ao próximo grupo de pessoas até que este chegue ao fim.</p>
A partir das informações cedidas pelos clientes (médicos e/ou pacientes), poderemos contar com um extenso banco de dados contendo informações sensíveis como o endereço do paciente e que devem receber uma maior segurança para evitar o vazamento desses dados.
<p>As informações necessárias para efetuar o registro no sistema por parte dos pacientes são: Nome Completo, Data de Nascimento, Endereço (Logradouro, Número, Complemento, Bairro, Cidade, Estado, CEP, Tipo de Local), CPF, RG, Contatos (Telefone Residencial, Celular, E-Mail).</p>
<p>As informações necessárias para efetuar o registro no sistema por parte das clínicas/hospitais são: Razão Social, Nome Fantasia, CNPJ, Data de Fundação, Contatos (Email, Website, Telefone, Celular), Responsável, Endereço (Logradouro, Número, Complemento, Bairro, Cidade, Estado, CEP, Tipo de Local).</p>
<p>As informações necessárias para efetuar o cadastro dos médicos são: Nome Completo, Data de Nascimento, Endereço (Logradouro, Número, Complemento, Bairro, Cidade, Estado, CEP, Tipo de Local), CPF, RG, Contatos (Telefone Comercial, Telefone Residencial, Celular, E-Mail), Títulos de Especialista registrados no CRM (Conselho Regional de Medicina) e Clínicas/Hospitais em que trabalha atualmente.</p>
