package pt.ulusofona.tfc.trabalho.controller

import org.slf4j.LoggerFactory
import org.springframework.jdbc.BadSqlGrammarException
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import pt.ulusofona.tfc.trabalho.repository.S1FormularioRepository
import java.security.Principal

@Controller
@RequestMapping("/filter")
class FilterController(
        val jdbcTemplate: JdbcTemplate,
        val s1FormularioRepository: S1FormularioRepository
) {

    val LOG = LoggerFactory.getLogger(this.javaClass.name)

    @GetMapping(value = ["/new"])
    fun filter(
            @RequestParam("fields") fields: List<String>?,
            @RequestParam("values") values: List<String>?,
            model: ModelMap, principal: Principal?
    ): String {


        var processoIds: List<String> = emptyList()
        var valor: Boolean = false
        var i = 0
        var campo = ""
        var saberForm = ""
        var query = ""
        var listaDeStrings = HashMap<Int,ArrayList<String>>()

        if (fields != null && values != null) {

            if (fields.isEmpty() || values.isEmpty()) {
                model["error"] = "Erro: Tem que preencher um filtro"
            } else if (!fields.all { it.startsWith("s") && it.contains(".") }) {
                model["error"] = "Erro: Filtro mal preenchido"
            } else if (!values.all { it == "SIM" || it == "NÃO" }) {
                model["error"] = "Erro: Os valores têm que ser SIM ou NÃO"
            } else {
                for (field in fields) {
                    campo = field.replace(".", "_")
                    valor = values[i] == "SIM"
                    saberForm = campo[0].toString() + campo[1] + campo[2]
                    var listinha = ArrayList<String>()
                    when (saberForm) {
                        "s2_" -> {
                            if (listaDeStrings.containsKey(2)){
                                listaDeStrings[2]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(2,listinha)
                            }
                        }

                        "s3_" -> {
                            if (listaDeStrings.containsKey(3)){
                                listaDeStrings[3]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(3,listinha)
                            }
                        }

                        "s4_" -> {
                            if (listaDeStrings.containsKey(4)){
                                listaDeStrings[4]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(4,listinha)
                            }
                        }

                        "s5_" -> {
                            if (listaDeStrings.containsKey(5)){
                                listaDeStrings[5]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(5,listinha)
                            }
                        }

                        "s6_" -> {
                            if (listaDeStrings.containsKey(6)){
                                listaDeStrings[6]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(6,listinha)
                            }
                        }

                        "s7_" -> {
                            if (listaDeStrings.containsKey(7)){
                                listaDeStrings[7]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(7,listinha)
                            }
                        }

                        "s8_" -> {
                            if (listaDeStrings.containsKey(8)){
                                listaDeStrings[8]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(8,listinha)
                            }
                        }

                        "s9_" -> {
                            if (listaDeStrings.containsKey(9)){
                                listaDeStrings[9]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(9,listinha)
                            }
                        }

                        "s10" -> {
                            if (listaDeStrings.containsKey(10)){
                                listaDeStrings[10]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(10,listinha)
                            }
                        }

                        "s11" -> {
                            if (listaDeStrings.containsKey(11)){
                                listaDeStrings[11]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(11,listinha)
                            }
                        }

                        "s12" -> {
                            if (listaDeStrings.containsKey(12)){
                                listaDeStrings[12]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(12,listinha)
                            }
                        }

                        "s13" -> {
                            if (listaDeStrings.containsKey(13)){
                                listaDeStrings[13]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(13,listinha)
                            }
                        }

                        "s14" -> {
                            if (listaDeStrings.containsKey(14)){
                                listaDeStrings[14]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(14,listinha)
                            }
                        }

                        "s15" -> {
                            if (listaDeStrings.containsKey(15)){
                                listaDeStrings[15]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(15,listinha)
                            }
                        }

                        "s16" -> {
                            if (listaDeStrings.containsKey(16)){
                                listaDeStrings[16]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(16,listinha)
                            }
                        }

                        "s17" -> {
                            if (listaDeStrings.containsKey(17)){
                                listaDeStrings[17]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(17,listinha)
                            }
                        }

                        "s18" -> {
                            if (listaDeStrings.containsKey(18)){
                                listaDeStrings[18]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(18,listinha)
                            }
                        }

                        "s19" -> {
                            if (listaDeStrings.containsKey(19)){
                                listaDeStrings[19]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(19,listinha)
                            }
                        }

                        "s20" -> {
                            if (listaDeStrings.containsKey(20)){
                                listaDeStrings[20]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(20,listinha)
                            }
                        }

                        "s21" -> {
                            if (listaDeStrings.containsKey(21)){
                                listaDeStrings[21]!!.add("$campo = $valor")
                            } else {
                                listinha.add("$campo = $valor")
                                listaDeStrings.put(21,listinha)
                            }
                        }

                        else -> break
                    }
                    i++
                }
                var verifica = false
                var campoList = ArrayList<String>(1)
                for (i in 2..21){
                    var listinha = ArrayList<String>()
                    if (listaDeStrings.containsKey(i) && !verifica){
                        listinha = listaDeStrings.get(i)!!
                        campoList.add("s$i" + "formulario")
                        var campoString = campoList[0]
                        println(campoString)
                        query = "SELECT process_id FROM $campoString where "
                        for (o in 0..listinha.size - 1){
                            var string =  listinha[o]
                            if (o < listinha.size - 1){
                                query += "$string AND "
                            } else {
                                query += "$string"
                            }
                        }
                        verifica = true
                    } else if (listaDeStrings.containsKey(i) && verifica){
                        var campoString = "s$i" + "formulario"
                        var campoStringIni = campoList[0]
                        listinha = listaDeStrings.get(i)!!
                        query += " INNER JOIN $campoString ON $campoStringIni.process_id = $campoString.process_id where "
                        for (o in 0..listinha.size - 1){
                            var string =  listinha[o]
                            if (o < listinha.size - 1){
                                query += "$string AND "
                            } else {
                                query += "$string"
                            }
                        }
                    }
                }
                println(query)

                try {
                    LOG.info(query)
                    processoIds = jdbcTemplate.query(query) { rs, _ -> rs.getString("process_id") }
                } catch (e: BadSqlGrammarException) {
                    model["error"] = "O campo indicado não existe"
                    LOG.error("O campo indicado não existe")
                }
            }
        }

        // adaptar para usar os fields e os values para construir a string sql
        //val sql = "SELECT process_id FROM s5formulario where s5_1_1_a = 0"
        val processos = if (processoIds.isNotEmpty()) {
            processoIds.map { s1FormularioRepository.findByProcessId(it)!! }
        } else {
            emptyList()
        }


        model["processos"] = processos
        // adiciono sempre um novo campo vazio
        val fieldsPlusOne = fields?.toMutableList() ?: ArrayList()
        if (model["error"] == null) {
            fieldsPlusOne.add("")
        }

        // adiciono sempre um novo valor vazio
        val valuesPlusOne = values?.toMutableList() ?: ArrayList()
        if (model["error"] == null) {
            valuesPlusOne.add("")
        }

        model["fields"] = fieldsPlusOne
        model["values"] = valuesPlusOne

        return "filter"
    }
}