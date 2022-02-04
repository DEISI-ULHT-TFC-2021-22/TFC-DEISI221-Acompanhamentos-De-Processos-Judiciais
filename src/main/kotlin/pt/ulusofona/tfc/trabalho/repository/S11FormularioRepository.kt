package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S11Formulario

interface S11FormularioRepository: JpaRepository<S11Formulario, Long> {

    fun findByProcessId(processId : String) : S11Formulario?

}