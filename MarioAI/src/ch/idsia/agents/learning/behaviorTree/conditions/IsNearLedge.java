/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.conditions;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.benchmark.mario.engine.GeneralizerLevelScene;
import ch.idsia.benchmark.mario.engine.sprites.Mario;

/**
 *
 * @author Alexsh
 */
public class IsNearLedge extends Condition{
    
    public IsNearLedge(BasicMarioAIAgent _agent) {
        super(_agent);
    }
    
    private boolean blocked(){
        boolean nearLedge = false;
       // System.out.println("LEDGE " + _agent.getMarioEgoRow()  + " " + _agent.getMarioEgoCol()  +" CHECK: GR ( " + this._agent.getReceptiveFieldWidth() + " , " + this._agent.getReceptiveFieldHeight() + "  ) " +  _agent.getLevelScene()[this._agent.getReceptiveFieldWidth() / 2][this._agent.getReceptiveFieldHeight() / 2 + 1] + 
       // " |||\t " + GeneralizerLevelScene.ZLevelGeneralization( _agent.getLevelScene()[this._agent.getReceptiveFieldWidth() / 2][this._agent.getReceptiveFieldHeight() / 2 + 1],0));
        
      //  nearLedge = _agent.getLevelScene()[this._agent.getReceptiveFieldWidth() / 2][this._agent.getReceptiveFieldHeight() / 2 + 1] != 0 &&
      //          _agent.getLevelScene()[this._agent.getReceptiveFieldWidth() / 2 / 2 + 1][this._agent.getReceptiveFieldHeight() / 2 + 1] == 0;
        
      if(nearLedge)
        System.out.println("NEAR LEDGE " + nearLedge + " " + GeneralizerLevelScene.ZLevelGeneralization( _agent.getLevelScene()[this._agent.getReceptiveFieldWidth() / 2][this._agent.getReceptiveFieldHeight() / 2 + 1],0));
        
        return nearLedge;
    }
    
    @Override
    public boolean run() {    
        
       // System.out.println("BLOCKED " + blocked());
        
        return blocked();
    }
}
