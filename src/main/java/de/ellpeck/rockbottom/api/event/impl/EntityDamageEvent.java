/*
 * This file ("EntityDamageEvent.java") is part of the RockBottomAPI by Ellpeck.
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

package de.ellpeck.rockbottom.api.event.impl;

import de.ellpeck.rockbottom.api.entity.EntityLiving;
import de.ellpeck.rockbottom.api.event.Event;

/**
 * This event is fired when an {@link EntityLiving} takes damage using the
 * {@link EntityLiving#takeDamage(int)} method. Changing the amount will result
 * in the damage changing. Cancelling the event will result in the entity taking
 * no damage.
 */
public class EntityDamageEvent extends Event{

    public final EntityLiving entity;
    public int amount;

    public EntityDamageEvent(EntityLiving entity, int amount){
        this.entity = entity;
        this.amount = amount;
    }
}
