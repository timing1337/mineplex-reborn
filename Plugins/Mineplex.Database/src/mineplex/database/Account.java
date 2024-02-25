/**
 * This class is generated by jOOQ
 */
package mineplex.database;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account extends org.jooq.impl.SchemaImpl implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1890093529;

	/**
	 * The reference instance of <code>Account</code>
	 */
	public static final Account Account = new Account();

	/**
	 * No further instances allowed
	 */
	private Account() {
		super("Account");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			mineplex.database.tables.AccountAmplifierThank.accountAmplifierThank,
			mineplex.database.tables.AccountAuth.accountAuth,
			mineplex.database.tables.AccountClan.accountClan,
			mineplex.database.tables.AccountCoinTransactions.accountCoinTransactions,
			mineplex.database.tables.AccountCustomData.accountCustomData,
			mineplex.database.tables.AccountFriend.accountFriend,
			mineplex.database.tables.AccountGemTransactions.accountGemTransactions,
			mineplex.database.tables.AccountGiveaway.accountGiveaway,
			mineplex.database.tables.AccountIgnore.accountIgnore,
			mineplex.database.tables.AccountInventory.accountInventory,
			mineplex.database.tables.AccountMortenSpamTest.accountMortenSpamTest,
			mineplex.database.tables.AccountPets.accountPets,
			mineplex.database.tables.AccountPolls.accountPolls,
			mineplex.database.tables.AccountPreferences.accountPreferences,
			mineplex.database.tables.AccountPurchases.accountPurchases,
			mineplex.database.tables.Accounts.accounts,
			mineplex.database.tables.AccountStat.accountStat,
			mineplex.database.tables.AccountTasks.accountTasks,
			mineplex.database.tables.AccountThank.accountThank,
			mineplex.database.tables.AccountThankTransactions.accountThankTransactions,
			mineplex.database.tables.AccountTip.accountTip,
			mineplex.database.tables.AccountTipClaimLogs.accountTipClaimLogs,
			mineplex.database.tables.AccountTipLogs.accountTipLogs,
			mineplex.database.tables.AccountTransactions.accountTransactions,
			mineplex.database.tables.AccountValentinesGift.accountValentinesGift,
			mineplex.database.tables.AccountWebsiteLinkCode.accountWebsiteLinkCode,
			mineplex.database.tables.ActiveTournaments.activeTournaments,
			mineplex.database.tables.BattlePets.battlePets,
			mineplex.database.tables.Bonus.bonus,
			mineplex.database.tables.BonusLog.bonusLog,
			mineplex.database.tables.BotSpam.botSpam,
			mineplex.database.tables.Chatsnap.chatsnap,
			mineplex.database.tables.ClanAlliances.clanAlliances,
			mineplex.database.tables.ClanBanners.clanBanners,
			mineplex.database.tables.ClanBans.clanBans,
			mineplex.database.tables.ClanEnemies.clanEnemies,
			mineplex.database.tables.ClanMember.clanMember,
			mineplex.database.tables.ClanNameBlacklist.clanNameBlacklist,
			mineplex.database.tables.Clans.clans,
			mineplex.database.tables.ClanServer.clanServer,
			mineplex.database.tables.ClansGold.clansGold,
			mineplex.database.tables.ClanShopItem.clanShopItem,
			mineplex.database.tables.ClansNetherPortals.clansNetherPortals,
			mineplex.database.tables.ClansOutposts.clansOutposts,
			mineplex.database.tables.ClansPvpTimer.clansPvpTimer,
			mineplex.database.tables.ClansSiegeWeapons.clansSiegeWeapons,
			mineplex.database.tables.ClansTutorial.clansTutorial,
			mineplex.database.tables.ClanTerritory.clanTerritory,
			mineplex.database.tables.ClanWar.clanWar,
			mineplex.database.tables.CustomData.customData,
			mineplex.database.tables.EloRating.eloRating,
			mineplex.database.tables.Facebook.facebook,
			mineplex.database.tables.FieldBlock.fieldBlock,
			mineplex.database.tables.FieldMonster.fieldMonster,
			mineplex.database.tables.FieldOre.fieldOre,
			mineplex.database.tables.Gadgets.gadgets,
			mineplex.database.tables.Giveaway.giveaway,
			mineplex.database.tables.GiveawayCooldown.giveawayCooldown,
			mineplex.database.tables.IncognitoStaff.incognitoStaff,
			mineplex.database.tables.ItemCategories.itemCategories,
			mineplex.database.tables.Items.items,
			mineplex.database.tables.Kitpreferences.kitpreferences,
			mineplex.database.tables.KitProgression.kitProgression,
			mineplex.database.tables.Mail.mail,
			mineplex.database.tables.Mailbox.mailbox,
			mineplex.database.tables.NonPremiumJoinMessage.nonPremiumJoinMessage,
			mineplex.database.tables.Npcs.npcs,
			mineplex.database.tables.Packages.packages,
			mineplex.database.tables.PlayerMap.playerMap,
			mineplex.database.tables.Polls.polls,
			mineplex.database.tables.PowerPlayClub.powerPlayClub,
			mineplex.database.tables.RankBenefits.rankBenefits,
			mineplex.database.tables.RankedBans.rankedBans,
			mineplex.database.tables.ReportTickets.reportTickets,
			mineplex.database.tables.Selectedgadgets.selectedgadgets,
			mineplex.database.tables.Selectedmodifiers.selectedmodifiers,
			mineplex.database.tables.SelectedMounts.selectedMounts,
			mineplex.database.tables.SelectedPets.selectedPets,
			mineplex.database.tables.ServerPassword.serverPassword,
			mineplex.database.tables.Spawns.spawns,
			mineplex.database.tables.StaffMotd.staffMotd,
			mineplex.database.tables.StatEvents.statEvents,
			mineplex.database.tables.Stats.stats,
			mineplex.database.tables.StatTypes.statTypes,
			mineplex.database.tables.Streamers.streamers,
			mineplex.database.tables.Tasks.tasks,
			mineplex.database.tables.TitanGiveaway.titanGiveaway,
			mineplex.database.tables.TournamentLB.TournamentLB,
			mineplex.database.tables.Tournaments.tournaments,
			mineplex.database.tables.TournamentTeams.tournamentTeams,
			mineplex.database.tables.Transactions.transactions,
			mineplex.database.tables.Unicodereplacer.unicodereplacer,
			mineplex.database.tables.Youtube.youtube);
	}
}