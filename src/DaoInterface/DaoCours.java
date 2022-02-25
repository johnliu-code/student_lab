/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoInterface;

import java.util.List;
import model.Cours;

/**
 *
 * @author jeanl
 */
public interface DaoCours {
    void create(Cours cours);
    void add(Cours cours, List<Cours> listCours);
    void delete(Cours cours, List<Cours> listCours);
    void update(Cours cours);
    void find(Cours cours);
    void print(Cours cours);
    List<Cours> findAll();
}
