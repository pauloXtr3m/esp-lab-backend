package lab.api;

import com.google.gson.Gson;
import lab.model.Venda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulo on 12/08/17.
 */

@RestController
@RequestMapping("/api")
public class VendaController {

    @GetMapping("/venda")
    public String venda(){
        Venda venda = new Venda("Mouse", 2);
        Gson gson = new Gson();
        return gson.toJson(venda);
    }

    @PostMapping("/venda")
    public String salvarVenda(Venda venda){
        //TODO salvar a venda
        Gson gson = new Gson();
        return gson.toJson(venda);
    }

    @GetMapping("/vendas")
    public String listarVendas(){
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        for(int i = 0; i < 9; i++){
            vendas.add(new Venda("Mouse", 2));
        }

        Gson gson = new Gson();
        return gson.toJson(vendas);
    }

}
