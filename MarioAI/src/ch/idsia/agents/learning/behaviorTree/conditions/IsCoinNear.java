/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.conditions;

import ch.idsia.agents.controllers.BasicMarioAIAgent;

/**
 *
 * @author Alexsh
 */
public class IsCoinNear extends Condition{
    
    public IsCoinNear(BasicMarioAIAgent _agent) {
        super(_agent);
    }
    
    @Override
    public boolean run(){
        for(int i=0;i<=this._agent.getReceptiveFieldWidth();i++){
            for (int j = 0; j <= this._agent.getReceptiveFieldHeight(); j++) {
                if(_agent.enemies[i][j] == 20)
                    return true;
            }
        }
        return false;
    }
    
    
}
