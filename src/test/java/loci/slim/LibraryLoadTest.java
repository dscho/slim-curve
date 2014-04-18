/*
 * #%L
 * Test SLIM Curve Java layer library.
 * %%
 * Copyright (C) 2013 - 2014 Board of Regents of the University of
 * Wisconsin-Madison.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

package loci.slim;

import org.junit.Test;

/**
 * Tests whether platform-appropriate native library can be loaded w/o exception.
 * 
 * @author Aivar Grislis
 */
public class LibraryLoadTest {
	
	@Test
	public void loadLibrary() throws Exception {
		SLIMCurve slimCurve = new SLIMCurve();
	}
}