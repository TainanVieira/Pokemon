 fun main(){
     val pokemons = listOf(
         Pokemon("Bulbasaur", listOf("Grass", "Poison")),
         Pokemon("Ivysaur", listOf("Grass", "Poison")),
         Pokemon("Venusaur", listOf("Grass", "Poison")),
         Pokemon("Charmander", listOf("Fire")),
         Pokemon("Charmeleon", listOf("Fire")),
         Pokemon("Charizard", listOf("Fire", "Flying")),
         Pokemon("Squirtle", listOf("Water")),
         Pokemon("Wartortle", listOf("Water")),
         Pokemon("Blastoise", listOf("Water")),
         Pokemon("Caterpie", listOf("Bug")),
         Pokemon("Metapod", listOf("Bug")),
         Pokemon("Butterfree", listOf("Bug", "Flying")),
         Pokemon("Weedle", listOf("Bug", "Poison")),
         Pokemon("Kakuna", listOf("Bug", "Poison")),
         Pokemon("Beedrill", listOf("Bug", "Poison")),
         Pokemon("Pidgey", listOf("Normal", "Flying")),
         Pokemon("Pidgeotto", listOf("Normal", "Flying")),
         Pokemon("Pidgeot", listOf("Normal", "Flying")),
         Pokemon("Rattata", listOf("Normal")),
         Pokemon("Raticate", listOf("Normal")),
         Pokemon("Spearow", listOf("Normal", "Flying")),
         Pokemon("Fearow", listOf("Normal", "Flying")),
         Pokemon("Ekans", listOf("Poison")),
         Pokemon("Arbok", listOf("Poison")),
         Pokemon("Pikachu", listOf("Electric")),
         Pokemon("Raichu", listOf("Electric")),
         Pokemon("Sandshrew", listOf("Ground")),
         Pokemon("Sandslash", listOf("Ground")),
         Pokemon("Nidoran♀", listOf("Poison")),
         Pokemon("Nidorina", listOf("Poison")),
         Pokemon("Nidoqueen", listOf("Poison", "Ground")),
         Pokemon("Nidoran♂", listOf("Poison")),
         Pokemon("Nidorino", listOf("Poison")),
         Pokemon("Nidoking", listOf("Poison", "Ground")),
         Pokemon("Clefairy", listOf("Fairy")),
         Pokemon("Clefable", listOf("Fairy")),
         Pokemon("Vulpix", listOf("Fire")),
         Pokemon("Ninetales", listOf("Fire")),
         Pokemon("Jigglypuff", listOf("Normal", "Fairy")),
         Pokemon("Wigglytuff", listOf("Normal", "Fairy")),
         Pokemon("Zubat", listOf("Poison", "Flying")),
         Pokemon("Golbat", listOf("Poison", "Flying")),
         Pokemon("Oddish", listOf("Grass", "Poison")),
         Pokemon("Gloom", listOf("Grass", "Poison")),
         Pokemon("Vileplume", listOf("Grass", "Poison")),
         Pokemon("Paras", listOf("Bug", "Grass")),
         Pokemon("Parasect", listOf("Bug", "Grass")),
         Pokemon("Venonat", listOf("Bug", "Poison")),
         Pokemon("Venomoth", listOf("Bug", "Poison")),
         Pokemon("Diglett", listOf("Ground")),
         Pokemon("Dugtrio", listOf("Ground")),
         Pokemon("Meowth", listOf("Normal")),
         Pokemon("Persian", listOf("Normal")),
         Pokemon("Psyduck", listOf("Water")),
         Pokemon("Golduck", listOf("Water")),
         Pokemon("Mankey", listOf("Fighting")),
         Pokemon("Primeape", listOf("Fighting")),
         Pokemon("Growlithe", listOf("Fire")),
         Pokemon("Arcanine", listOf("Fire")),
         Pokemon("Poliwag", listOf("Water")),
         Pokemon("Poliwhirl", listOf("Water")),
         Pokemon("Poliwrath", listOf("Water", "Fighting")),
         Pokemon("Abra", listOf("Psychic")),
         Pokemon("Kadabra", listOf("Psychic")),
         Pokemon("Alakazam", listOf("Psychic")),
         Pokemon("Machop", listOf("Fighting")),
         Pokemon("Machoke", listOf("Fighting")),
         Pokemon("Machamp", listOf("Fighting")),
         Pokemon("Bellsprout", listOf("Grass", "Poison")),
         Pokemon("Weepinbell", listOf("Grass", "Poison")),
         Pokemon("Victreebel", listOf("Grass", "Poison")),
         Pokemon("Tentacool", listOf("Water", "Poison")),
         Pokemon("Tentacruel", listOf("Water", "Poison")),
         Pokemon("Geodude", listOf("Rock", "Ground")),
         Pokemon("Graveler", listOf("Rock", "Ground")),
         Pokemon("Golem", listOf("Rock", "Ground")),
         Pokemon("Ponyta", listOf("Fire")),
         Pokemon("Rapidash", listOf("Fire")),
         Pokemon("Slowpoke", listOf("Water", "Psychic")),
         Pokemon("Slowbro", listOf("Water", "Psychic")),
         Pokemon("Magnemite", listOf("Electric", "Steel")),
         Pokemon("Magneton", listOf("Electric", "Steel")),
         Pokemon("Farfetch’d", listOf("Normal", "Flying")),
         Pokemon("Doduo", listOf("Normal", "Flying")),
         Pokemon("Dodrio", listOf("Normal", "Flying")),
         Pokemon("Seel", listOf("Water")),
         Pokemon("Dewgong", listOf("Water", "Ice")),
         Pokemon("Grimer", listOf("Poison")),
         Pokemon("Muk", listOf("Poison")),
         Pokemon("Shellder", listOf("Water")),
         Pokemon("Cloyster", listOf("Water", "Ice")),
         Pokemon("Gastly", listOf("Ghost", "Poison")),
         Pokemon("Haunter", listOf("Ghost", "Poison")),
         Pokemon("Gengar", listOf("Ghost", "Poison")),
         Pokemon("Onix", listOf("Rock", "Ground")),
         Pokemon("Drowzee", listOf("Psychic")),
         Pokemon("Hypno", listOf("Psychic")),
         Pokemon("Krabby", listOf("Water")),
         Pokemon("Kingler", listOf("Water")),
         Pokemon("Voltorb", listOf("Electric")),
         Pokemon("Electrode", listOf("Electric")),
         Pokemon("Exeggcute", listOf("Grass", "Psychic")),
         Pokemon("Exeggutor", listOf("Grass", "Psychic")),
         Pokemon("Cubone", listOf("Ground")),
         Pokemon("Marowak", listOf("Ground")),
         Pokemon("Hitmonlee", listOf("Fighting")),
         Pokemon("Hitmonchan", listOf("Fighting")),
         Pokemon("Lickitung", listOf("Normal")),
         Pokemon("Koffing", listOf("Poison")),
         Pokemon("Weezing", listOf("Poison")),
         Pokemon("Rhyhorn", listOf("Ground", "Rock")),
         Pokemon("Rhydon", listOf("Ground", "Rock")),
         Pokemon("Chansey", listOf("Normal")),
         Pokemon("Tangela", listOf("Grass")),
         Pokemon("Kangaskhan", listOf("Normal")),
         Pokemon("Horsea", listOf("Water")),
         Pokemon("Seadra", listOf("Water")),
         Pokemon("Goldeen", listOf("Water")),
         Pokemon("Seaking", listOf("Water")),
         Pokemon("Staryu", listOf("Water")),
         Pokemon("Starmie", listOf("Water", "Psychic")),
         Pokemon("Mr. Mime", listOf("Psychic", "Fairy")),
         Pokemon("Scyther", listOf("Bug", "Flying")),
         Pokemon("Jynx", listOf("Ice", "Psychic")),
         Pokemon("Electabuzz", listOf("Electric")),
         Pokemon("Magmar", listOf("Fire")),
         Pokemon("Pinsir", listOf("Bug")),
         Pokemon("Tauros", listOf("Normal")),
         Pokemon("Magikarp", listOf("Water")),
         Pokemon("Gyarados", listOf("Water", "Flying")),
         Pokemon("Lapras", listOf("Water", "Ice")),
         Pokemon("Ditto", listOf("Normal")),
         Pokemon("Eevee", listOf("Normal")),
         Pokemon("Vaporeon", listOf("Water")),
         Pokemon("Jolteon", listOf("Electric")),
         Pokemon("Flareon", listOf("Fire")),
         Pokemon("Porygon", listOf("Normal")),
         Pokemon("Omanyte", listOf("Rock", "Water")),
         Pokemon("Omastar", listOf("Rock", "Water")),
         Pokemon("Kabuto", listOf("Rock", "Water")),
         Pokemon("Kabutops", listOf("Rock", "Water")),
         Pokemon("Aerodactyl", listOf("Rock", "Flying")),
         Pokemon("Snorlax", listOf("Normal")),
         Pokemon("Articuno", listOf("Ice", "Flying")),
         Pokemon("Zapdos", listOf("Electric", "Flying")),
         Pokemon("Moltres", listOf("Fire", "Flying")),
         Pokemon("Dratini", listOf("Dragon")),
         Pokemon("Dragonair", listOf("Dragon")),
         Pokemon("Dragonite", listOf("Dragon", "Flying")),
         Pokemon("Mewtwo", listOf("Psychic")),
         Pokemon("Mew", listOf("Psychic"))
     )


    val tiposEfetivos = mapOf(
        "Normal" to emptyList(),
        "Fire" to listOf("Grass", "Ice", "Bug", "Steel"),
        "Water" to listOf("Fire", "Ground", "Rock"),
        "Electric" to listOf("Water", "Flying"),
        "Grass" to listOf("Water", "Ground", "Rock"),
        "Ice" to listOf("Grass", "Ground", "Flying", "Dragon"),
        "Fighting" to listOf("Normal", "Ice", "Rock", "Dark", "Steel"),
        "Poison" to listOf("Grass", "Fairy"),
        "Ground" to listOf("Fire", "Electric", "Poison", "Rock", "Steel"),
        "Flying" to listOf("Grass", "Fighting", "Bug"),
        "Psychic" to listOf("Fighting", "Poison"),
        "Bug" to listOf("Grass", "Psychic", "Dark"),
        "Rock" to listOf("Fire", "Ice", "Flying", "Bug"),
        "Ghost" to listOf("Psychic", "Ghost"),
        "Dragon" to listOf("Dragon"),
        "Dark" to listOf("Psychic", "Ghost"),
        "Steel" to listOf("Ice", "Rock", "Fairy"),
        "Fairy" to listOf("Fighting", "Dragon", "Dark"),
        "Stellar" to listOf("Terastallized")
    )

    println("Treinador um digite seu nome")
    val nickName1 = readLine().toString()

    println("Treinador dois digite seu nome")
    val nickName2 = readLine().toString()

    println("\nLista de Pokémons disponíveis:")

     pokemons.forEachIndexed{ index, lista ->
        println("${index + 1}. ${lista.name} (${lista.types.joinToString(", ")})")
    }


    val treinador1Pokemons = selecionarPokemons(nickName1, pokemons)
    val treinador2Pokemons = selecionarPokemons(nickName2, pokemons)

    println("\n$nickName1 escolheu:")
    treinador1Pokemons.forEach { println("- ${it.name}") }

    println("\n$nickName2 escolheu:")
    treinador2Pokemons.forEach { println("- ${it.name}") }


    println("\n=== BATALHA POKÉMON ===")

    var pontosTreinador1 = 0
    var pontosTreinador2 = 0

    for (i in 0 until 5) {
        val p1 = treinador1Pokemons[i]
        val p2 = treinador2Pokemons[i]

        println("\nBatalha ${i + 1}: ${p1.name} vs ${p2.name}")

        val resultado = batalhar(p1, p2, tiposEfetivos)

        when (resultado) {
            1 -> {
                println("${p1.name} venceu!")
                pontosTreinador1++
            }
            -1 -> {
                println("${p2.name} venceu!")
                pontosTreinador2++
            }
            0 -> println("Empate entre ${p1.name} e ${p2.name}!")
        }
    }

    println("\n=== RESULTADO FINAL ===")
    println("$nickName1: $pontosTreinador1 ponto(s)")
    println("$nickName2: $pontosTreinador2 ponto(s)")

    when {
        pontosTreinador1 > pontosTreinador2 -> println("🏆 $nickName1 é o grande vencedor!")
        pontosTreinador2 > pontosTreinador1 -> println("🏆 $nickName2 é o grande vencedor!")
        else -> println("🤝 A batalha terminou empatada!")
    }


}


fun batalhar(p1: Pokemon, p2: Pokemon, tiposEfetivos: Map<String, List<String>>): Int {
    val p1Efetivo = p1.types.any { tipo ->
        tiposEfetivos[tipo]?.any { it in p2.types } == true
    }

    val p2Efetivo = p2.types.any { tipo ->
        tiposEfetivos[tipo]?.any { it in p1.types } == true
    }

    return when {
        p1Efetivo && !p2Efetivo -> 1
        p2Efetivo && !p1Efetivo -> -1
        else -> 0
    }
}

fun selecionarPokemons(treinador: String, pokemons: List<Pokemon>): List<Pokemon> {
    val escolhidos = mutableListOf<Pokemon>()
    while (escolhidos.size < 5) {
        println("\n$treinador, escolha o número do Pokémon ${escolhidos.size + 1}:")
        val escolha = readLine()?.toIntOrNull()

        if (escolha == null || escolha !in 1..pokemons.size) {
            println("Escolha inválida. Tente novamente.")
        } else {
            val escolhido = pokemons[escolha - 1]
            if (escolhido in escolhidos) {
                println("Você já escolheu esse Pokémon.")
            } else {
                escolhidos.add(escolhido)
                println("${escolhido.name} adicionado ao seu time!")
            }
        }
    }
    return escolhidos

}


data class Pokemon(val name: String, val types: List<String>)


