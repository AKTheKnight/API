/*
 * This file ("PartByte.java") is part of the RockBottomAPI by Ellpeck.
 * View the source code at <https://github.com/RockBottomGame/>.
 * View information on the project at <https://rockbottom.ellpeck.de/>.
 *
 * The RockBottomAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The RockBottomAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the RockBottomAPI. If not, see <http://www.gnu.org/licenses/>.
 *
 * © 2017 Ellpeck
 */

package de.ellpeck.rockbottom.api.data.set.part.num;

import de.ellpeck.rockbottom.api.data.set.part.BasicDataPart;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class PartByte extends BasicDataPart<Byte>{

    public PartByte(String name){
        super(name);
    }

    public PartByte(String name, Byte data){
        super(name, data);
    }

    @Override
    public void write(DataOutput stream) throws IOException{
        stream.writeByte(this.data);
    }

    @Override
    public void read(DataInput stream) throws IOException{
        this.data = stream.readByte();
    }
}
