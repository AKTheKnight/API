/*
 * This file ("IKnowledgeManager.java") is part of the RockBottomAPI by Ellpeck.
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

package de.ellpeck.rockbottom.api.entity.player.knowledge;

import de.ellpeck.rockbottom.api.construction.IRecipe;
import de.ellpeck.rockbottom.api.construction.resource.IUseInfo;
import de.ellpeck.rockbottom.api.item.ItemInstance;
import de.ellpeck.rockbottom.api.util.reg.IResourceName;

public interface IKnowledgeManager{

    boolean knowsRecipe(IRecipe recipe);

    boolean knowsIngredient(IRecipe recipe, IUseInfo info);

    boolean knowsOutput(IRecipe recipe, ItemInstance instance);

    boolean knowsInformation(IResourceName name);

    Information getInformation(IResourceName name);

    <T extends Information> T getInformation(IResourceName name, Class<T> infoClass);

    void teachRecipe(IRecipe recipe, boolean teachAllParts, boolean announce);

    void teachRecipe(IRecipe recipe, boolean teachAllParts);

    void teachIngredient(IRecipe recipe, IUseInfo info, boolean announce);

    void teachIngredient(IRecipe recipe, IUseInfo info);

    void teachOutput(IRecipe recipe, ItemInstance instance, boolean announce);

    void teachOutput(IRecipe recipe, ItemInstance instance);

    void teachInformation(Information information, boolean announce);

    void teachInformation(Information information);

    void forgetRecipe(IRecipe recipe, boolean forgetAllParts, boolean announce);

    void forgetRecipe(IRecipe recipe, boolean forgetAllParts);

    void forgetIngredient(IRecipe recipe, IUseInfo info, boolean announce);

    void forgetIngredient(IRecipe recipe, IUseInfo info);

    void forgetOutput(IRecipe recipe, ItemInstance instance, boolean announce);

    void forgetOutput(IRecipe recipe, ItemInstance instance);

    void forgetInformation(IResourceName name, boolean announce);

    void forgetInformation(IResourceName name);
}
