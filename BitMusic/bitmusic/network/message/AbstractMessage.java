/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package network.message;

/**
 *
 * @author florian
 */
public abstract class AbstractMessage {
    private EnumTypeMessage type;
    private String ipSource;
    private String ipDest;

    public AbstractMessage(String paramIpSource, String paramIpDest){
        //Set les ip avec appel au controller
        ipSource = paramIpSource;
        ipDest = paramIpDest;
    }

    public abstract void treatment();
}
