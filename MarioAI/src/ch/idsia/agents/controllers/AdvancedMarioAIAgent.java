/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.controllers;

import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Sequence;
import ch.idsia.agents.learning.behaviorTree.*;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.CompositeTask;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.RandomSelector;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.RandomSequence;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Selector;
import ch.idsia.agents.learning.behaviorTree.Decorators.Inverter;
import ch.idsia.agents.learning.behaviorTree.Decorators.Repeat;
import ch.idsia.agents.learning.behaviorTree.actions.Jump;
import ch.idsia.agents.learning.behaviorTree.actions.MoveLeft;
import ch.idsia.agents.learning.behaviorTree.actions.MoveRight;
import ch.idsia.agents.learning.behaviorTree.actions.StopMoving;
import ch.idsia.agents.learning.behaviorTree.conditions.IsEnemyNear;
import ch.idsia.agents.learning.behaviorTree.conditions.IsNearLedge;
import ch.idsia.benchmark.mario.engine.GlobalOptions;

import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.mario.environments.Environment;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javafx.scene.paint.Stop;

/**
 *
 * @author Alexsh
 * 
 * controller for Mario that tries to:
 * collect as many coins as possible, 
 * and kill as many enemies as possible.
 * 
 */
public class AdvancedMarioAIAgent extends BasicMarioAIAgent {
    

    
    protected BehaviorTree _myBehavior;
    protected ArrayList<Sequence> _myBehaviors = new ArrayList<>();
    
    public AdvancedMarioAIAgent(String s) {
        super(s);
        reset();
    }
    
    public AdvancedMarioAIAgent(){
        super("AdvancedAI");
        SetBehavior();
        reset();
    }
    
    private void SetBehavior(){
                



        
        
        
        //this._myTasks.add(new IsNearLedge(this));
       // this._myTasks.add(new Jump(this));
        //this._myTasks.add(new MoveLeft(this));
        ///this._myTasks.add(new Jump(this));
        
       // this._myTasks.add(new IsEnemyNear(this));
        
        
        
        //this._myTasks.add(new IsEnemyNear(this));
        //this._myTasks.add(new MoveLeft(this));
        
        //this._myTasks.add(new IsEnemyNear(this));
        //this._myTasks.add(new MoveRight(this));
               
        //Sequence _sequence = new Sequence(this, this._myTasks);
        
       // ArrayList _behavior = new ArrayList<>();
       // _behavior.add(new Repeat(this, _sequence, 10));


        
        //this._myBehavior = new Sequence(this, _behavior);
      // this._myBehavior = _sequence;
        
        this._myBehavior = new MarioBehaviorTree(this);
        
 
        
    }
    
    private boolean _status;
    
    public boolean[] getAction(){
        if(this._myBehavior!=null){
            //_status = 
                    this._myBehavior.run();
            
            //if(_status){
               // System.out.println("Status of BT: " + _status);
            //}
        }
        return action;
    }

    public void reset(){
        
        
  //      action = new boolean[Environment.numberOfKeys];
//        action[Mario.KEY_RIGHT] = true;
   //     action[Mario.KEY_SPEED] = true;
    }
}
