# Lista09-Java

## Programação Orientada a Objetos em Java

### Exercício 1 — Classe ContaCorrente

Implemente uma classe `ContaCorrente` para controlar saques, depósitos e consultar os dados de uma conta bancária.

**Atributos privados:**
- `numero` (`int`)
- `agencia` (`int`)
- `saldo` (`double`)

**Métodos:**

| Método | Descrição |
|---|---|
| `ContaCorrente(int n, int ag)` | Construtor que inicializa o número, a agência e o saldo em zero. |
| `sacar(double valor)` | Realiza um saque somente se houver saldo suficiente. Caso contrário, emite uma mensagem de erro. |
| `depositar(double valor)` | Adiciona um valor ao saldo da conta. |
| `consultarSaldo()` | Retorna o saldo atual. |
| `exibe()` | Retorna os dados da conta, incluindo agência, número e saldo. |

**Requisitos adicionais:**
- Solicitar ao usuário o número e a agência da conta.
- Solicitar um valor para depósito e exibir os dados da conta utilizando `exibe()`.
- Solicitar um valor para saque e exibir novamente os dados atualizados.
- Impedir saques com valores superiores ao saldo disponível.
- Substituir o método `iniciarContaCorrente()` por um construtor.
- Documentar as classes e os métodos utilizando comentários `/** */`, reconhecidos pela ferramenta Javadoc.

**Compilação e execução no GitHub Codespaces:**

```bash
javac Main.java
javadoc -d docs Main.java
java Main
```

A documentação será gerada na pasta `docs`. Caso ela não exista, será criada automaticamente.

**Observação:** instale o plugin `Live Server` no Codespace para visualizar a documentação.

---

### Exercício 2 — Classe Aluno

Crie uma classe `Aluno` com os seguintes atributos privados:

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `matricula` | `int` |
| `curso` | `String` |

**Métodos:**
- Construtor para inicializar os atributos.
- Métodos públicos `get()` e `set()` para cada atributo.
- `exibirDados()` — imprime as informações do aluno.

**Na classe `Main`:**
1. Instancie dois objetos da classe `Aluno`.
2. Defina os dados de cada aluno.
3. Exiba os dados utilizando o método `exibirDados()`.

---

### Exercício 3 — Classe Produto

Crie uma classe `Produto` com os seguintes atributos privados:

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `preco` | `double` |
| `quantidadeEstoque` | `int` |

**Métodos:**
- Construtor para inicializar os atributos.
- Métodos `get()` e `set()` para cada atributo.
- `reporEstoque(int quantidade)` — aumenta a quantidade em estoque.
- `venderProduto(int quantidade)` — reduz o estoque somente se houver quantidade suficiente.
- `exibirProduto()` — apresenta os dados do produto.

**Na classe `Principal`:**
1. Instancie um produto.
2. Faça uma reposição de estoque.
3. Realize uma venda.
4. Exiba os dados atualizados do produto.
