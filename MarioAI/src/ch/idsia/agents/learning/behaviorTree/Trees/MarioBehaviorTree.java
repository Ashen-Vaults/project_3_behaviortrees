/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.Trees;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.CompositeTask;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.RandomSelector;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Selector;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Sequence;
import ch.idsia.agents.learning.behaviorTree.Decorators.Inverter;
import ch.idsia.agents.learning.behaviorTree.Task;
import ch.idsia.agents.learning.behaviorTree.actions.Jump;
import ch.idsia.agents.learning.behaviorTree.actions.MoveLeft;
import ch.idsia.agents.learning.behaviorTree.actions.MoveRight;
import ch.idsia.agents.learning.behaviorTree.actions.StopMoving;
import ch.idsia.agents.learning.behaviorTree.conditions.IsCoinNear;
import ch.idsia.agents.learning.behaviorTree.conditions.IsCoinObtainable;
import ch.idsia.agents.learning.behaviorTree.conditions.IsEnemyNear;
import ch.idsia.agents.learning.behaviorTree.conditions.IsNearLedge;
import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class MarioBehaviorTree extends BehaviorTree{
    
    private CompositeTask _root;
    private CompositeTask _killEnemy;
    private CompositeTask _avoidLedge;
    private CompositeTask _collectCoins;
    
    
    
    public MarioBehaviorTree(BasicMarioAIAgent _agent){
        
        super(_agent);
          
        /*----------------------------------------------------------*/
        
        
        ArrayList<Task> _killEnemyTasks = new ArrayList<>();
        _killEnemyTasks.add(new IsEnemyNear(_agent));
        _killEnemyTasks.add(new Jump(_agent));
        _killEnemyTasks.add(new MoveRight(_agent));
        _killEnemy = new Sequence(_agent,_killEnemyTasks);
        
        
        /*----------------------------------------------------------*/
        
        
        ArrayList<Task> _avoidLedgeTasks = new ArrayList<>();
        _avoidLedgeTasks.add(new IsNearLedge(_agent));
       // _avoidLedgeTasks.add(new StopMoving(_agent));
        _avoidLedgeTasks.add(new Jump(_agent));
        _avoidLedge = new Sequence(_agent,_avoidLedgeTasks);
        
        
        /*----------------------------------------------------------*/
        
        
        ArrayList<Task> _collectCoinsTasks = new ArrayList<>();
        _collectCoinsTasks.add(new IsCoinObtainable(_agent));
        _collectCoinsTasks.add(new Jump(_agent));
        _collectCoins = new Sequence(_agent, _collectCoinsTasks);
        
        
        /*----------------------------------------------------------*/
        
        
        this._myTasks.add(new MoveRight(_agent));
        
        this._myTasks.add(_collectCoins);
        this._myTasks.add(_killEnemy);
        this._myTasks.add(_avoidLedge);
        
        
        _root = new RandomSelector(_agent, this._myTasks);
        
        this._myComposite = _root;
        
        /*
        //this._myTasks.add(new Repeat(this,new Jump(this),5));
        
        //this._myTasks.add(new IsEnemyNear(_agent));
        //this._myTasks.add(new Jump(_agent));
        //this._myTasks.add(new Inverter(_agent, new IsEnemyNear(_agent)));
        //this._myTasks.add(new Jump(_agent));
        
        this._myTasks.add(new Inverter(_agent, new IsEnemyNear(_agent)));
        this._myTasks.add(new MoveRight(_agent));
        this._myTasks.add(new IsEnemyNear(_agent));
       // this._myTasks.add(new MoveRight(_agent));
        this._myTasks.add(new Jump(_agent));
        //this._myTasks.add(new StopMoving(_agent));
        this._myTasks.add(new IsNearLedge(_agent));
        this._myTasks.add(new Jump(_agent));
        this._myTasks.add(new IsCoinObtainable(_agent));
        this._myTasks.add(new MoveLeft(_agent));
        //this._myTasks.add(new StopMoving(_agent));
       // this._myTasks.add(new IsNearLedge(_agent));
        //this._myTasks.add(new Jump(_agent));
        */
        /*
       // this._myTasks.add(new StopMoving(_agent));
        this._myTasks.add(new IsNearLedge(_agent));
        this._myTasks.add(new Jump(_agent));
        this._myTasks.add(new IsNearLedge(_agent));
        this._myTasks.add(new IsCoinObtainable(_agent));
        
        this._myTasks.add(new MoveLeft(_agent));
        this._myTasks.add(new IsNearLedge(_agent));
        this._myTasks.add(new Jump(_agent));
        
        this._myTasks.add(new IsCoinObtainable(_agent));
        
        //this._myTasks.add(new TraverseLevel(_agent));
        
        
       
        */
        // this._myComposite = new Sequence(_agent,this._myTasks);
    }   
    
    
}
