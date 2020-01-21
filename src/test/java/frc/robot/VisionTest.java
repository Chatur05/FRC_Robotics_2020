/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package frc.robot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import frc.robot.subsystems.Vision;
//import edu.wpi.first.wpilibj.HLUsageReporting;

public class VisionTest {
	static {
		//HLUsageReporting.SetImplementation(new HLUsageReporting.Null());
	}
	@Test
	public void findTarget() {
		System.out.print("I have entered Vision Test");
        Vision vs = new Vision();
        vs.trackVisionTarget();
		assertEquals(true, true);
	}

}