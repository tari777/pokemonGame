

open class Pokemon(var nome: String, var genero: String, var vida: Int, var nivel: Int, var xp: Int, var dano: Int, var defesa: Int){
}

class Fogo(var fireAttack: String, var dano_fireAttack: Int, var fireBall: String, var dano_fireBall: Int)
class Agua(var waterAttack: String, var dano_waterAttack: Int, var bubbleAttack: String, var dano_bubbleAttack: Int)
class Planta(var plantAttack: String, var dano_plantAttack: Int, var razorLeaf: String, var dano_razorLeaf: Int, var Heal: String, var cura_Heal: Int)
class Eletrico(var quickAttack: String, var dano_quickAttack: Int, var thunderBolt: String, var dano_thunderBolt: Int)
class Psychic (var fireAttack: String, var dano_fireAttack: Int, var fireBall: String, var dano_fireBall: Int, var waterAttack: String, var dano_waterAttack: Int, var bubbleAttack: String, var dano_bubbleAttack: Int,
               var plantAttack: String, var dano_plantAttack: Int, var razorLeaf: String, var dano_razorLeaf: Int, var Heal: String, var cura_Heal: Int,
               var quickAttack: String, var dano_quickAttack: Int, var thunderBolt: String, var dano_thunderBolt: Int)

fun main(){

    var charmander = Pokemon("Charmander", "Fogo", 40, 10, 0, 10, 4)
    var squirtle = Pokemon("Squirtle", "Água", 35, 10, 0, 12, 4)
    var bulbasaur = Pokemon("Bulbasaur", "Planta", 30, 10, 0, 10, 4)
    var jolteon = Pokemon("Jolteon", "Elétrico", 50,15,0, 10, 6)
    var psicico  = Pokemon("Psychic", "Psicico", 40, 15,0,10,4)

    //Ataques
    var Fogo = Fogo("FireAttack",2, "FireBall", 3 )
    var Planta = Planta("PlantAttack",3, "RazorLeaf",3, "Heal",3)
    var Agua = Agua("WatterAttack",1, "BubbleAttack",4)
    var Eletrico = Eletrico("QuickAttack", 3, "ThunderBolt", 4)
    var Psychic = Psychic("FireAttack", 2, "Fireball",3, "WatterAttack",1,"BubbleAttack",4, "PlantAttack",
        3 , "RazorLeaf", 3, "Heal", 3, "QuickAttack", 3 , "ThunderBolt", 4)

    var caterpie = Pokemon("Caterpie", "Planta", 40, 7, 0, 8, 4)
    var pikachu = Pokemon("Pikachu", "Elétrico", 35, 6, 0, 8, 4)
    var magikarp = Pokemon("Magikarp", "Água", 25, 5, 0, 5, 4)

    println("Qual será seu Pokemon inicial: ")
    println("[1] Charmander")
    println("[2] Squirtle")
    println("[3] Bulbasaur")
    println("[4] Psychic")
    print("Escolha: ")
    var pInicial = readLine()


    //Vitorias
    var vitorias:Int = 0

    //Variaveis meu pokemon
    var pokemonNome: String? = null
    var pokemonGenero: String? = null
    var pokemonVida: Int? = null
    var pokemonVidaMax: Int? = null
    var pokemonNivel: Int? = null
    var pokemonXp: Int? = null
    var pokemonDef: Int? = null

    //Variaveis pokemon inimigo
    var pokemonNomeIni: String? = null
    var pokemonGeneroIni: String? = null
    var pokemonVidaIni: Int? = null
    var pokemonNivelIni: Int? = null
    var pokemonXpIni: Int? = null
    var pokemonDefIni: Int? = null



    fun escolhaInicial() {
        if (pInicial == "1") {
            println("--------------------------------------")
            pokemonNome = charmander.nome
            pokemonGenero = charmander.genero
            pokemonVida = charmander.vida
            pokemonVidaMax = charmander.vida
            pokemonNivel = charmander.nivel
            pokemonXp = charmander.xp
            pokemonDef = charmander.defesa
            println("Pokemon escolhido: Charmander")
            println("Gênero: "+ charmander.genero)
            println("Vida: "+ charmander.vida)
            println("Nível: "+ charmander.nivel)
            println("Xp: "+ charmander.xp)
            println("Dano: [1..10]")
            println("Defesa: "+ charmander.defesa)


        } else if (pInicial == "2") {
            println("--------------------------------------")
            pokemonNome = squirtle.nome
            pokemonGenero = squirtle.genero
            pokemonVida = squirtle.vida
            pokemonVidaMax = squirtle.vida
            pokemonNivel = squirtle.nivel
            pokemonXp = squirtle.xp
            pokemonDef = squirtle.defesa
            println("Pokemon escolhido: Squirtle")
            println("Gênero: "+ squirtle.genero)
            println("Vida: "+ squirtle.vida)
            println("Nível: "+ squirtle.nivel)
            println("Xp: "+ squirtle.xp)
            println("Dano: [1..10]")
            println("Defesa: "+ squirtle.defesa)
        } else if (pInicial == "3") {
            println("--------------------------------------")
            pokemonNome = bulbasaur.nome
            pokemonGenero = bulbasaur.genero
            pokemonVida = bulbasaur.vida
            pokemonVidaMax = bulbasaur.vida
            pokemonNivel = bulbasaur.nivel
            pokemonXp = bulbasaur.xp
            pokemonDef = bulbasaur.defesa
            println("Pokemon escolhido: Bulbasaur")
            println("Gênero: "+ bulbasaur.genero)
            println("Vida: "+ bulbasaur.vida)
            println("Nível: "+ bulbasaur.nivel)
            println("Xp: "+ bulbasaur.xp)
            println("Dano: [1..10]")
            println("Defesa: "+ bulbasaur.defesa)
        } else if (pInicial == "4") {
            println("--------------------------------------")
            pokemonNome = psicico.nome
            pokemonGenero = psicico.genero
            pokemonVida = psicico.vida
            pokemonVidaMax = psicico.vida
            pokemonNivel = psicico.nivel
            pokemonXp = psicico.xp
            pokemonDef = psicico.defesa
            println("Pokemon escolhido: Psychic")
            println("Gênero: "+ psicico.genero)
            println("Vida: "+ psicico.vida)
            println("Nível: "+ psicico.nivel)
            println("Xp: "+ psicico.xp)
            println("Dano: [1..10]")
            println("Defesa: "+ psicico.defesa)
        }
    }

    fun spam() {
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
        println("")
    }

    fun hud(){
        spam()
        println("--------------------------------------")
        println("  Seu pokemon:  $pokemonNome [LVL: $pokemonNivel]            ")
        println("Vida: $pokemonVida   " + "                 Ataque: [1..10]")
        println("Defesa: $pokemonDef " + "                 Tipo: $pokemonGenero")
        println("--------------------------------------")
    }

    fun sorteiaPokemon(){
        val aleatorio = (1..3).random()
        when (aleatorio) {
            1 -> {
                pokemonNomeIni = caterpie.nome
                pokemonGeneroIni = caterpie.genero
                pokemonVidaIni = caterpie.vida
                pokemonNivelIni = caterpie.nivel
                pokemonDefIni = caterpie.defesa

            }
            2 -> {
                pokemonNomeIni = pikachu.nome
                pokemonGeneroIni = pikachu.genero
                pokemonVidaIni = pikachu.vida
                pokemonNivelIni = pikachu.nivel
                pokemonDefIni = pikachu.defesa

            }
            3 -> {
                pokemonNomeIni = magikarp.nome
                pokemonGeneroIni = magikarp.genero
                pokemonVidaIni = magikarp.vida
                pokemonNivelIni = magikarp.nivel
                pokemonDefIni = magikarp.defesa
            }
        }
    }

    fun hudInimigo(){
        println("--------------------------------------")
        println("  Pokemon Inimigo:  $pokemonNomeIni [LVL: $pokemonNivelIni]            ")
        println("Vida: $pokemonVidaIni   " + "                 Ataque: [1..10]")
        println("Defesa: $pokemonDefIni " + "                 Tipo: $pokemonGeneroIni")
        println("--------------------------------------")
    }

    fun habilidadesFogo(){
        println("Habilidades:")
        println("1 - ${Fogo.fireAttack}          2 - ${Fogo.fireBall}")
        print("Escolha uma opção:")
        var acao = readLine()


        //FireAttack
        if (acao == "1")  {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Fogo.fireAttack} e causou [${pokemonDano + Fogo.dano_fireAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Fogo.dano_fireAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }

            //FireBall
        } else if (acao == "2") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Fogo.fireBall} e causou [${pokemonDano + Fogo.dano_fireBall}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Fogo.dano_fireBall)
            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        }
    }

    fun habilidadesPlanta(){
        println("Habilidades:")
        println("1 - ${Planta.plantAttack}          2 - ${Planta.razorLeaf}")
        println("                3 - ${Planta.Heal}          ")

        print("Escolha uma opção:")
        var acao = readLine()

        //PlantAttack
        if (acao == "1")  {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Planta.plantAttack} e causou [${pokemonDano + Planta.dano_plantAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Planta.dano_plantAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }

            //FireBall
        } else if (acao == "2") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Planta.razorLeaf} e causou [${pokemonDano + Planta.dano_razorLeaf}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Planta.dano_razorLeaf)
            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        } else if (acao == "3") {
            if (vitorias > 0) {
                println("Escolha um pokemon para curar:")
                println("[1] - $pokemonNome")
                println("[2] - ${jolteon.nome}")
                var curar = readLine()

                if (curar == "1") {
                    println("Seu pokemon usou ${Planta.Heal} e curou [${Planta.cura_Heal}] de vida")
                    pokemonVida = pokemonVida!! + Planta.cura_Heal
                } else if (curar == "2"){
                    println("Seu pokemon usou ${Planta.Heal} e curou [${Planta.cura_Heal}] de vida do ${jolteon.nome}")
                    println("Jolteon agora possui [${jolteon.vida}] de vida!")
                    jolteon.vida = jolteon.vida!! + Planta.cura_Heal
                }
            } else {
                println("Seu pokemon usou ${Planta.Heal} e curou [${Planta.cura_Heal}] de vida")
                pokemonVida = pokemonVida!!.plus(Planta.cura_Heal)
                println("Vida total do pokemon: $pokemonVida")
            }

        }
    }

    fun habilidadesEletrico(){
        println("Habilidades:")
        println("1 - ${Eletrico.quickAttack}          2 - ${Eletrico.thunderBolt}")

        print("Escolha uma opção:")
        var acao = readLine()

        //PlantAttack
        if (acao == "1")  {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Eletrico.quickAttack} e causou [${pokemonDano + Eletrico.dano_quickAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Eletrico.dano_quickAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }

            //FireBall
        } else if (acao == "2") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Eletrico.thunderBolt} e causou [${pokemonDano + Eletrico.dano_thunderBolt}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Eletrico.dano_thunderBolt)
            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        }

    }

    fun habilidadesAgua(){
        println("Habilidades:")
        println("1 - ${Agua.waterAttack}          2 - ${Agua.bubbleAttack}")
        print("Escolha uma opção:")
        var acao = readLine()


        //Watter Attack
        if (acao == "1")  {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Agua.waterAttack} e causou [${pokemonDano + Agua.dano_waterAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Agua.dano_waterAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }

            //FireBall
        } else if (acao == "2") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Agua.bubbleAttack} e causou [${pokemonDano + Agua.dano_bubbleAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Agua.dano_bubbleAttack)
            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        }
    }

    fun habilidadesPsic(){
        println("Habilidades:")
        println("1 - ${Psychic.plantAttack}          2 - ${Psychic.razorLeaf}")
        println("3 - ${Psychic.Heal}          4 - ${Psychic.fireBall}")
        println("5 - ${Psychic.fireAttack}          6 - ${Psychic.quickAttack}")
        println("7 - ${Psychic.thunderBolt}          8 - ${Psychic.waterAttack}")
        println("9 - ${Psychic.bubbleAttack}")


        print("Escolha uma opção:")
        var acao = readLine()

        //PlantAttack
        if (acao == "1")  {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.plantAttack} e causou [${pokemonDano + Psychic.dano_plantAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_plantAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }

            //FireBall
        } else if (acao == "2") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.razorLeaf} e causou [${pokemonDano + Psychic.dano_razorLeaf}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_razorLeaf)
            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        } else if (acao == "3") {
            if (vitorias > 0) {
                println("Escolha um pokemon para curar:")
                println("[1] - $pokemonNome")
                println("[2] - ${jolteon.nome}")
                var curar = readLine()

                if (curar == "1") {
                    println("Seu pokemon usou ${Psychic.Heal} e curou [${Psychic.cura_Heal}] de vida")
                    pokemonVida = pokemonVida!! + Psychic.cura_Heal
                } else if (curar == "2"){
                    println("Seu pokemon usou ${Psychic.Heal} e curou [${Psychic.cura_Heal}] de vida do ${jolteon.nome}")
                    println("Jolteon agora possui [${jolteon.vida}] de vida!")
                    jolteon.vida = jolteon.vida!! + Psychic.cura_Heal
                }
            } else {
                println("Seu pokemon usou ${Psychic.Heal} e curou [${Psychic.cura_Heal}] de vida")
                pokemonVida = pokemonVida!!.plus(Psychic.cura_Heal)
                println("Vida total do pokemon: $pokemonVida")
            }

    } else if ( acao == "4") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.fireBall} e causou [${pokemonDano + Psychic.dano_fireBall}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_fireBall)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        } else if ( acao == "5") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.fireAttack} e causou [${pokemonDano + Psychic.dano_fireAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_fireAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        } else if ( acao == "6") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.quickAttack} e causou [${pokemonDano + Psychic.dano_quickAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_quickAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        } else if (acao == "7") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.thunderBolt} e causou [${pokemonDano + Psychic.dano_thunderBolt}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_thunderBolt)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        } else if (acao == "8") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.waterAttack} e causou [${pokemonDano + Psychic.dano_waterAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_waterAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        } else if (acao == "9") {
            val pokemonDano = (1..10).random()
            if (pokemonDano!! >= pokemonDefIni!!) {
                println("Seu pokemon usou ${Psychic.bubbleAttack} e causou [${pokemonDano + Psychic.dano_bubbleAttack}] de dano")
                //Subtrai a vida do inimigo
                pokemonVidaIni = pokemonVidaIni!!.minus(pokemonDano + Psychic.dano_bubbleAttack)

            } else {
                println("O Pokemon inimigo defendeu seu ataque!")
            }
        }

    }


    fun ataqueInimigo(){
        val pokemonDanoIni: Int = (1..10).random()
        if (pokemonDanoIni > pokemonDef!!) {
            print("O pokemon inimigou causou [$pokemonDanoIni] de dano")
            pokemonVida = pokemonVida!! - pokemonDanoIni
            Thread.sleep(2_000)

        } else {
            print("O ataque do pokemon inimigo falhou!")
            Thread.sleep(2_000)
        }
    }

    fun derrota(){
        spam()
        println("--------------------------------------")
        println("              DERROTA                 ")
        println("--------------------------------------")
        println("O $pokemonNome foi derrotado por $pokemonNomeIni")
    }

    fun vitoria(){
        spam()
        println("--------------------------------------")
        println("              VITÓRIA                 ")
        println("--------------------------------------")
        println("O $pokemonNomeIni foi derrotado por $pokemonNome")
        println("Seu pokemon $pokemonNome ganhou 100 xp")
        pokemonXp = pokemonXp?.plus(100) //Adiciona 100 de xp
        if (pokemonXp!! > 99) {
            pokemonNivel = pokemonNivel?.plus(1)
            pokemonXp = 0
            pokemonVida = pokemonVidaMax
            println("Seu pokemon $pokemonNome subiu para o nível $pokemonNivel")
        }
        vitorias += 1

    }

    fun empate(){
        spam()
        println("--------------------------------------")
        println("              EMPATE                 ")
        println("--------------------------------------")
    }

    fun batalha() {
        println("--------------------------------------")
        println("Procurando Adversário...")
        Thread.sleep(4_000)
        println("Treinador adversário encontrado!")
        Thread.sleep(2_000)

        sorteiaPokemon() //Sorteia o inimigo
        do {

            if (pokemonVida!! < 1 || pokemonVidaIni!! < 1){
                if (pokemonVida!! < 1) {
                    derrota()

                } else if (pokemonVidaIni!! < 1){
                    vitoria()
                }
                break
            }



            hud() //Mostra a hud do seu pokemon
            hudInimigo() //Mostra a hud do pokemon Inimigo


            //Mostra os ataques de cada tipo
            if (pokemonGenero == "Fogo") {
                habilidadesFogo()
            }

            if (pokemonGenero == "Planta") {
                habilidadesPlanta()
            }

            if (pokemonGenero == "Água") {
                habilidadesAgua()
            }

            if (pokemonGenero == "Elétrico") {
                habilidadesEletrico()
            }
            if (pokemonGenero == "Psicico") {
                habilidadesPsic()
            }
            println("--------------------------------------")
            println("Turno do Inimigo...")
            Thread.sleep(2_000)


            ataqueInimigo()
        } while (pokemonVida!! > 0 || pokemonVidaIni!! > 0)
        if (pokemonVida!! < 1 && pokemonVidaIni!! < 1){
            empate()
        }
    }

    escolhaInicial()



    batalha()

    if (vitorias!! > 0) {
        println("--------------------------------------")
        print("Um pokemon selvagem apareceu, seu nome é ${jolteon.nome} ")
        println("Deseja capturá-lo [Sim / Não]:")
        var capturar = readLine()

        if (capturar != null) {
            Thread.sleep(1_000)
            println("Bom, a sua vontade não é prioridade aqui, iriamos capturá-lo de qualquer maneira")
            Thread.sleep(3_000)
            println("Parabéns. Agora ${jolteon.nome} está na sua equipe!")
            Thread.sleep(3_000)

            //Nova batalha
            spam()
            println("Escolha um Pokemon para batalhar: ")
            println("[1] $pokemonNome")
            println("[2] ${jolteon.nome}")
            print("Escolha: ")
            var escolha = readLine()

            if (escolha == "1") {
                println("--------------------------------------")
                println("Pokemon escolhido: $pokemonNome")
                println("Gênero: "+ pokemonGenero)
                println("Vida: "+ pokemonVida)
                println("Nível: "+ pokemonNivel)
                println("Xp: "+ pokemonXp)
                println("Dano: [1..10]")
                println("Defesa: "+ pokemonDef)

            } else if (escolha == "2") {
                println("--------------------------------------")
                pokemonNome = jolteon.nome
                pokemonGenero = jolteon.genero
                pokemonVida = jolteon.vida
                pokemonNivel = jolteon.nivel
                pokemonXp = jolteon.xp
                pokemonDef = jolteon.defesa
                println("Pokemon escolhido: Jolteon")
                println("Gênero: "+ jolteon.genero)
                println("Vida: "+ jolteon.vida)
                println("Nível: "+ jolteon.nivel)
                println("Xp: "+ jolteon.xp)
                println("Dano: [1..15]")
                println("Defesa: "+ jolteon.defesa)

            }


            batalha()
        }
    }

}