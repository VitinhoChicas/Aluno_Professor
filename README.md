# ☕ Java - Aluno & Professor

> Este programa identifica se o usuário é um aluno ou um professor. Caso seja um aluno, o código calcula sua média e verifica se ele passou de ano. Se for um professor, o código calcula o valor total das horas extras adicionadas ao seu salário.

## 🎓 Aluno 
### 📋 Informações Capturadas:
- **Nome**
- **Idade**
- **Telefone**
- **RA**
- **Notas**: Nota 1, Nota 2, Nota 3, Nota 4, Nota 5.

### 🔢 Funcionamento
1. O programa soma as cinco notas do aluno e calcula a média dividindo o total por 5.
2. A partir da média obtida, determina-se a situação do aluno:
   - **Média maior que 7**: Aprovado.
   - **Média menor ou igual a 5**: Em recuperação.
   - **Recuperação**: O aluno deve resolver a seguinte conta para passar de ano: `10 x 5 - 5`.
     - Se acertar, ele passa de ano.
     - Se errar, ele repete o ano.

---

## 👨‍🏫 Professor
### 📋 Informações Capturadas:
- **Nome**
- **Idade**
- **Telefone**
- **CPF**
- **Quantidade de horas extras** (O valor da hora extra é R$10,00)
- **Salário**

### 🔢 Funcionamento
1. O programa soma as horas extras trabalhadas e multiplica pelo valor de R$10,00 por hora.
2. O valor das horas extras é adicionado ao salário base.
3. O sistema exibe o salário total atualizado.

---

## 🛠 Tecnologias Utilizadas
- Java
- Estruturas condicionais e cálculos matemáticos
