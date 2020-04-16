/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author me
 */
public class PersistenceUtil {

    EntityManagerFactory factory
            = Persistence.createEntityManagerFactory(
                    "mavenproject2", properties);
    EntityManager em = factory.createEntityManager();
    public static getEntityManager()
    {
    return this.em;
    }

}
