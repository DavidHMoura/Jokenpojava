🧾 Documentação – JoKenPo.java
📌 Descrição

O programa JoKenPo é uma implementação simples do clássico jogo Pedra, Papel e Tesoura, desenvolvido em Java.
O jogador compete contra o computador, que realiza jogadas aleatórias. Ao final de cada rodada, o programa exibe o resultado (vitória, derrota ou empate) e pergunta se o jogador deseja continuar.

🧠 Lógica do Jogo

O jogador escolhe entre 1 (Pedra), 2 (Papel) ou 3 (Tesoura).

O computador gera aleatoriamente um número de 1 a 3, representando sua jogada.

As regras são as tradicionais:

Pedra vence Tesoura

Tesoura vence Papel

Papel vence Pedra

O jogo continua até o jogador escolher sair.

⚙️ Estrutura do Código
Classe Principal
public class JoKenPo


Contém o método main que gerencia o fluxo principal do jogo.

🧩 Métodos
public static void main(String[] args)

Responsável por iniciar o programa e controlar o loop do jogo.

Etapas principais:

Cria instâncias de Scanner (entrada do usuário) e Random (para jogada do computador).

Exibe o menu e solicita a jogada do jogador.

Gera uma jogada aleatória para o computador.

Exibe as escolhas e o resultado da rodada.

Pergunta se o jogador deseja jogar novamente.

private static int lerEscolhaValida(Scanner sc)

Lê e valida a entrada do jogador.

Descrição:
Garante que o valor digitado seja um número entre 1 e 3.
Se o valor for inválido, solicita novamente.

Retorno:
Inteiro representando a jogada do jogador:

1 → Pedra

2 → Papel

3 → Tesoura

private static String nomeEscolha(int n)

Converte o número da jogada em texto legível.

Retorno:

1 → "Pedra"

2 → "Papel"

3 → "Tesoura"

Qualquer outro → "Desconhecido"

private static int verificaVencedor(int jogador, int computador)

Define o resultado da rodada com base nas regras do jogo.

Retorno:

0 → Empate

1 → Jogador vence

-1 → Computador vence

private static boolean lerSimNao(Scanner sc)

Lê a resposta do usuário sobre continuar ou encerrar o jogo.

Descrição:
Aceita respostas como “s”, “sim”, “n”, “não” ou “nao”.
Qualquer outra entrada repete a pergunta.

Retorno:

true → Jogar novamente

false → Encerrar o jogo

💻 Exemplo de Execução
=== JO-KEN-PÔ ===

Escolha sua jogada:
1 - Pedra
2 - Papel
3 - Tesoura
Digite o número (1-3): 2

Você escolheu: Papel
Computador escolheu: Pedra
Você ganhou! 🎉

Quer jogar novamente? (s/n): s

🧱 Estrutura de Arquivos Sugerida
JavaTest/
│
├── src/
│   └── JoKenPo.java
│
├── bin/
│
├── .vscode/
│
└── README.md

🧰 Tecnologias Utilizadas

Java SE 17+

VS Code (para edição e execução)

Git + GitHub (para versionamento)

📄 Licença

Este projeto é de uso livre para fins educacionais.
Autor: David H. Moura
Repositório: github.com/DavidHMoura/Jokenpojava
