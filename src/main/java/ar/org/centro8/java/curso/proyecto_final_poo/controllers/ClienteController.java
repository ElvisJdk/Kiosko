package ar.org.centro8.java.curso.proyecto_final_poo.controllers;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Cliente;
import ar.org.centro8.java.curso.proyecto_final_poo.services.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("clientes", service.listar());
        return "clientes-list";
    }

    @GetMapping("/alta")
    public String alta(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente-alta";
    }

    @PostMapping("/guardar")
    public String guardar(Cliente c) {
        if (c.getActivo() == null)
            c.setActivo(true);
        service.guardar(c);
        return "redirect:/clientes";
    }

    @GetMapping("/editar")
    public String editar(@RequestParam int id, Model model) {
        model.addAttribute("cliente", service.buscar(id));
        return "cliente-editar";
    }

    @PostMapping("/actualizar")
    public String actualizar(Cliente c) {
        service.actualizar(c);
        return "redirect:/clientes";
    }

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam int id, RedirectAttributes ra) {
        try {
            service.eliminar(id);
            ra.addFlashAttribute("mensaje", "Cliente eliminado correctamente.");
        } catch (DataIntegrityViolationException e) {
            ra.addFlashAttribute("error",
                    "No se puede eliminar el cliente porque tiene ventas asociadas. " +
                            "Para eliminarlo, primero debe eliminar o anular esas ventas.");
        }
        return "redirect:/clientes";
    }

}
