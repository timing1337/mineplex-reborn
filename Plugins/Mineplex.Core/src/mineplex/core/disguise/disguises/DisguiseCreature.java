package mineplex.core.disguise.disguises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.minecraft.server.v1_8_R3.*;
import net.minecraft.server.v1_8_R3.DataWatcher.WatchableObject;

import org.bukkit.entity.EntityType;

public abstract class DisguiseCreature extends DisguiseInsentient
{
	public DisguiseCreature(EntityType disguiseType, org.bukkit.entity.Entity entity)
	{
		super(disguiseType, entity);
	}

	@SuppressWarnings("deprecation")
	public Packet getSpawnPacket()
	{
		PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving();
		packet.a = getEntity().getId();
		packet.b = (byte) getDisguiseType().getTypeId();
		packet.c = MathHelper.floor(getEntity().locX * 32.0D);
		packet.d = MathHelper.floor(getEntity().locY * 32.0D);
		packet.e = MathHelper.floor(getEntity().locZ * 32.0D);
		packet.i = (byte) ((int) (getEntity().yaw * 256.0F / 360.0F));
		packet.j = (byte) ((int) (getEntity().pitch * 256.0F / 360.0F));
		packet.k = (byte) ((int) (getEntity().yaw * 256.0F / 360.0F));
		packet.uuid = getEntity().getUniqueID();

        double var2 = 3.9D;
        double var4 = 0;
        double var6 = 0;
        double var8 = 0;

        if (var4 < -var2)
        {
            var4 = -var2;
        }

        if (var6 < -var2)
        {
            var6 = -var2;
        }

        if (var8 < -var2)
        {
            var8 = -var2;
        }

        if (var4 > var2)
        {
            var4 = var2;
        }

        if (var6 > var2)
        {
            var6 = var2;
        }

        if (var8 > var2)
        {
            var8 = var2;
        }

        packet.f = (int)(var4 * 8000.0D);
        packet.g = (int)(var6 * 8000.0D);
        packet.h = (int)(var8 * 8000.0D);

        packet.l = DataWatcher;
		packet.m = DataWatcher.b();

		return packet;
	}

	// ---- Metadata processing

	// This WON'T be post-processed by the Spigot metadata processor
    // Don't think this is neccessary...?
	@Override
	public Packet modifySpawnPacket(int protocol, Packet packet)
	{
		return packet;
    }

	protected int getTypeId(boolean separate)
	{
		return getDisguiseType().getTypeId();
	}

	// This WILL be post-processed by Spigot's metadata processor

	@Override
	public Packet modifyMetaPacket(int protocol, Packet packet)
	{
		return packet;
	}
}
