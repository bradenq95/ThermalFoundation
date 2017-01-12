package cofh.thermalfoundation.render.entity;

import cofh.thermalfoundation.entity.monster.EntityBasalz;
import cofh.thermalfoundation.render.model.ModelElemental;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly (Side.CLIENT)
public class RenderEntityBasalz extends RenderLiving<EntityBasalz> {

	private static ResourceLocation texture;

	public static void initialize() {

		texture = new ResourceLocation("thermalfoundation:textures/entity/" + "basalz.png");
	}

	public RenderEntityBasalz(RenderManager renderManager) {

		super(renderManager, ModelElemental.instance, 0.5F);
	}

	@Override
	public void doRender(EntityBasalz entity, double d0, double d1, double d2, float f, float f1) {

		doRenderBasalz((EntityBasalz) entity, d0, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBasalz par1Entity) {

		return texture;
	}

	protected void doRenderBasalz(EntityBasalz entity, double d0, double d1, double d2, float f, float f1) {

		super.doRender(entity, d0, d1, d2, f, f1);
	}

}
