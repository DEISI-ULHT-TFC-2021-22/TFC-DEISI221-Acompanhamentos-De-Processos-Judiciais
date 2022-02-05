package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S19Formulario(
        @Id @GeneratedValue
       //secção 19
        val id: Long = 0,
        var processId: String = "",
                //19.1
        var s19_1_A : Boolean = false,
        var s19_1_B : Boolean = false,
        var s19_1_C : Boolean = false,
        var s19_1_D : Boolean = false,
        var s19_1_E : Boolean = false,
        var s19_1_F : Boolean = false,
        var s19_1_F_f : String = "",
                //19.2
        var s19_2 : String = "",
                //19.3
        var s19_3_1 : String = "",
        var s19_3_2 : String = "",
)