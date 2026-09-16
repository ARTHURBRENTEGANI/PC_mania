package br.inatel.cdg.pcmania.main;

import java.util.Scanner;
// impota as classe processar Processarpedido e todas do pacote model 
import br.inatel.cdg.pcmania.model.*;
import br.inatel.cdg.pcmania.service.ProcessarPedido;

public class main {

    private static final float MATRICULA = 9863;

    public static void main(String[] args) {

        // cria objeto de scann para entrada de daddos 
        Scanner sc = new Scanner(System.in);
        
        // cria um objeto chamdo cliente ja com atrinustos definidos 
        Cliente cliente =
                new Cliente(
                        "Arthur",
                        "123.456.789-00",
                        10
                );

        // cria um array contendo os 3 computadores 
        Computador[] promocoes =
                criarPromocoes();

        int opcao;

        do {

            System.out.println("\n1 - Apple");
            System.out.println("2 - Samsung");
            System.out.println("3 - Dell");
            System.out.println("0 - Finalizar");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    cliente.adicionarComputador(promocoes[0]);
                    break;

                case 2:
                    cliente.adicionarComputador(promocoes[1]);
                    break;

                case 3:
                    cliente.adicionarComputador(promocoes[2]);
                    break;

                case 0:
                    System.out.println("Compra finalizada.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        ProcessarPedido.enviarPedido(
                cliente.getComputadores()
        );

        cliente.mostrarCompras();

        sc.close();
    }

    public static Computador[] criarPromocoes() {

        Computador pc1 =
                new Computador(
                        "Apple",
                        MATRICULA,

                        new HardwareBasico[]{
                                new HardwareBasico(
                                        "Core i5",
                                        2200
                                ),

                                new HardwareBasico(
                                        "RAM",
                                        8
                                ),

                                new HardwareBasico(
                                        "HD",
                                        500
                                )
                        },

                        new SistemaOperacional(
                                "macOS Sequoia",
                                64
                        ),

                        new MemoriaUSB(
                                "Pen-drive",
                                16
                        )
                );

        Computador pc2 =
                new Computador(
                        "Samsung",
                        MATRICULA + 1,

                        new HardwareBasico[]{
                                new HardwareBasico(
                                        "Core i7",
                                        3370
                                ),

                                new HardwareBasico(
                                        "RAM",
                                        16
                                ),

                                new HardwareBasico(
                                        "HD",
                                        1024
                                )
                        },

                        new SistemaOperacional(
                                "Windows 8",
                                64
                        ),

                        new MemoriaUSB(
                                "Pen-drive",
                                32
                        )
                );

        Computador pc3 =
                new Computador(
                        "Dell",
                        MATRICULA + 2,

                        new HardwareBasico[]{
                                new HardwareBasico(
                                        "Core i7",
                                        4500
                                ),

                                new HardwareBasico(
                                        "RAM",
                                        32
                                ),

                                new HardwareBasico(
                                        "HD",
                                        2048
                                )
                        },

                        new SistemaOperacional(
                                "Windows 10",
                                64
                        ),

                        new MemoriaUSB(
                                "HD Externo",
                                1024
                        )
                );

        return new Computador[]{
                pc1,
                pc2,
                pc3
        };
    }
}