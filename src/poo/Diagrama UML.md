### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class IReprodutorMusical {
        + tocar(): void
        + pausar(): void
        + selecionarMusica(musica: String): void
    }

    class IAparelhoTelefonico {
        + ligar(numero: String): void
        + atender(): void
        + iniciarCorreioVoz(): void
    }

    class INavegadorInternet {
        + exibirPagina(url: String): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }

    class Iphone {
        + tocar(): void
        + pausar(): void
        + selecionarMusica(): void
        + ligar(): void
        + atender(): void
        + iniciarCorreioVoz(): void
        + exibirPagina(): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }

    Iphone implements IReprodutorMusical
    Iphone implements IAparelhoTelefonico
    Iphone implements INavegadorInternet
```


