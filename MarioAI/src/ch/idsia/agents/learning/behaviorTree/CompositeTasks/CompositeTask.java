/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.CompositeTasks;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alexsh
 */
public class CompositeTask extends Task {
    
    public ArrayList<Task> myTasks = new ArrayList<>();
    protected Iterator<Task> _currentTask = myTasks.iterator();
    protected Task _current;
 
    public CompositeTask(BasicMarioAIAgent _agent, ArrayList<Task> _tasks) {
        super(_agent);
        this.myTasks = _tasks;
                if(this.myTasks!=null){
            this._currentTask = this.myTasks.iterator();
            
            if(this._currentTask!=null){
                if(this._currentTask.hasNext()){
                    _current = this._currentTask.next();
                    System.out.println("~Current Task: " + _current.getClass().getSimpleName());
                }
            }
            
        }
    }

    @Override
    public boolean run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
