package br.unesp.rc.springtutorial.service;

import br.unesp.rc.springtutorial.entity.Fisica;
import br.unesp.rc.springtutorial.utils.InstanceGenerator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Lucas
 */
@SpringBootTest
public class FisicaServiceTest {

    private Fisica entity;

    @Autowired
    private FisicaService fs = new FisicaService();

    @Disabled
    @Test
    @DisplayName("FisicaService.save(Fisica)")
    void testSave() {
        entity = InstanceGenerator.getPessoaFisica("222.333.444-55", "user1");
        System.out.println(entity);

        Fisica f = fs.save(entity);
        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

        assertEquals(entity, f);
    }

    @Disabled
    @Test
    @DisplayName("FisicaService.findByCpf(cpf)")
    void testFindByCpf() {
        entity = InstanceGenerator.getPessoaFisica("222.333.444-55", "user1");

        String cpf = "222.333.444-55";
        Fisica f = fs.findByCpf(cpf);

        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

        assertEquals(entity, f);
    }

    //@Disabled
    @Test
    @DisplayName("FisicaService.delete()")
    public void testDelete() {
        entity = InstanceGenerator.getPessoaFisica("111.222.333-55", "user5");
        System.out.println(entity);

        String cpf = "111.222.333-55";
        Fisica f = fs.findByCpf(cpf);

        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

        fs.delete(f);

        System.out.println("delete sucess");

        assertEquals(entity, f);
    }

    @Disabled
    @Test
    @DisplayName("FisicaService.update()")
    public void testUpdate() {
        entity = InstanceGenerator.getPessoaFisica("111.333.444-55", "user4");
        System.out.println(entity);

        String cpf = "222.333.444-55";
        Fisica f = fs.findByCpf(cpf);

        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

        fs.update(f);

        System.out.println("delete sucess");
        
        assertEquals(entity, f);
    }

    @Disabled
    @Test
    @DisplayName("FisicaService.findAll()")
    public void testFindAll() {
        System.out.println("findAll");

        Fisica expResult = null;
        List<Fisica> result = fs.findAll();
        for (Fisica f : result) {
            System.out.println("FISICA: " + f);
        }
        assertNotEquals(expResult, result);
    }
}
