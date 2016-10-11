package org.usfirst.frc.team2083.robot.commands.auto;

import org.usfirst.frc.team2083.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCommandBreachLowBar extends CommandGroup {
    
    public  AutoCommandBreachLowBar() {    	
    	requires(CommandBase.leftDrive);
    	requires(CommandBase.rightDrive);
    	requires(CommandBase.armBar);
    	
    	addSequential(new AutoCommandMoveArm());
       	addSequential(new AutoCommandDrive((long)2.5*1000, 6));
    }
}
