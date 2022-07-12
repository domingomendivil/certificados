package udelar.certificados

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController() {

    @CrossOrigin
    @GetMapping("/crearInvitacion")
    fun blog(): Invitacion {
          return Invitacion("1","http://www.invitacion.com")
     }

    @CrossOrigin
    @GetMapping("/certificados")
    fun getCertificados(): List<Certificado> {
        return ArrayList();
    }

    @CrossOrigin
    @PostMapping("/certificados")
    fun crearCertificado(certificado: Certificado){

    }


    @CrossOrigin
    @GetMapping("/invitaciones")
    fun getInvitaciones():List<Invitacion>{
        //TODO
        return ArrayList()
    }
}