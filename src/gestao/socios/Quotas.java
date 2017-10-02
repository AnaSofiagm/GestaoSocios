/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao.socios;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author Pedro Mendes
 */
public class Quotas extends Observable{
    
    private static final SimpleDateFormat DF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    private Map<String,Float> quotas;
    
    public Quotas(){
        this.quotas = new HashMap<>();
    }
    void pagar(float valor) {
        LocalDateTime now = LocalDateTime.now();
        Date date = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        this.quotas.put(DF.format(date),valor);
        this.setChanged();
        this.notifyObservers(quotas);
    }

    Map<String, Float> getQuotas() {
        return this.quotas;
    }
}
