/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.CompositeTask;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Selector;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Sequence;
import ch.idsia.agents.learning.behaviorTree.Decorators.Inverter;
import ch.idsia.agents.learning.behaviorTree.actions.Jump;
import ch.idsia.agents.learning.behaviorTree.actions.MoveRight;
import ch.idsia.agents.learning.behaviorTree.actions.StopMoving;
import ch.idsia.agents.learning.behaviorTree.conditions.IsEnemyNear;
import ch.idsia.agents.learning.behaviorTree.conditions.IsNearLedge;
import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class MarioBehaviorTree extends BehaviorTree{
        
    public MarioBehaviorTree(BasicMarioAIAgent _agent){
        
        super(_agent);
               
        //this._myTasks.add(new Repeat(this,new Jump(this),5));
        
        //this._myTasks.add(new IsEnemyNear(_agent));
        //this._myTasks.add(new Jump(_agent));
        //this._myTasks.add(new Inverter(_agent, new IsEnemyNear(_agent)));
        //this._myTasks.add(new Jump(_agent));
        
        
        this._myTasks.add(new MoveRight(_agent));
        this._myTasks.add(new IsNearLedge(_agent));
       // this._myTasks.add(new MoveRight(_agent));
        this._myTasks.add(new Jump(_agent));
        this._myTasks.add(new StopMoving(_agent));
      //  this._myTasks.add(new IsNearLedge(_agent));
     //  this._myTasks.add(new Jump(_agent));
        //this._myTasks.add(new IsNearLedge(_agent));
        //this._myTasks.add(new Jump(_agent));

        //this._myTasks.add(new StopMoving(_agent));
        
        //this._myTasks.add(new TraverseLevel(_agent));
        
        
        this._myComposite = new Sequence(_agent,this._myTasks);
        
    }   
    
    
}
